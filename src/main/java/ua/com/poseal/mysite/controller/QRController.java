package ua.com.poseal.mysite.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import ua.com.poseal.mysite.model.Token;
import ua.com.poseal.mysite.service.TokenService;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/qr_image")
public class QRController {

    @Value("${upload.path}")
    private String uploadPath;
    @Value("${file.mime-type}")
    private String mimeType;
    @Value("${upload.file}")
    private String fileName;
    @Value("${token.time}")
    private Long timeout;
    @Value("${qr.filename}")
    private String qrFile;

    private TokenService tokenService;

    @Autowired
    public QRController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @GetMapping()
    public String getGenerator() {
        return "qr_code";
    }

    @GetMapping("/doc/{token}")
    public Object downloadDocument(
            @PathVariable("token") String token,
            HttpServletResponse response) throws IOException {

        Token savedToken = tokenService.getToken(token);

        if (token.equals(savedToken.getToken())
            && LocalDateTime.now().isBefore(savedToken.getTimeCreation().plusSeconds(timeout))
        ) {
            // Content-Type
            response.setContentType(mimeType);

            // Content-Disposition
            response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + fileName);

            File file = new File(uploadPath + "/" + fileName);

            // Content-Length
            response.setContentLength((int) file.length());

            InputStream inputStream = new FileInputStream(file);

            return (StreamingResponseBody) outputStream -> {
                int bytesRead;
                byte[] buffer = new byte[1024];
                while ((bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                inputStream.close();
            };
        }
        return "main";
    }

    @GetMapping("/generator")
    public StreamingResponseBody downloadApp(
            HttpServletResponse response) throws IOException {

        String token = RandomStringUtils.randomAlphanumeric(10);

        Token savedToken = tokenService.saveToken(new Token(token));

        // create URL with token
        String url = "https://poseal.com.ua/qr_image/doc/" + savedToken.getToken();

        // Get QR - Code and return
        BitMatrix bitMatrix;
        try {
            bitMatrix = new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, 500, 500);

            File file = new File(uploadPath + File.separator + qrFile);

            MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(file.getAbsolutePath()));
            System.out.println("QR Code is generated");

            // Content-Type
            response.setContentType(mimeType);

            // Content-Disposition
            response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + qrFile);

            // Content-Length
            response.setContentLength((int) file.length());

            InputStream inputStream = new FileInputStream(file);

            return outputStream -> {
                int bytesRead;
                byte[] buffer = new byte[1024];
                while ((bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                inputStream.close();
            };

        } catch (WriterException e) {
            e.printStackTrace();
        }
        return null;
    }
}
