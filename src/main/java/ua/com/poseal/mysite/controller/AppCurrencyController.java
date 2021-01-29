package ua.com.poseal.mysite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import ua.com.poseal.mysite.service.DownloadService;
import ua.com.poseal.mysite.util.MediaTypeUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Controller
@RequestMapping("/currency")
public class AppCurrencyController {

    @Value("${upload.path}")
    private String uploadPath;
    @Value("${app.currency.filename}")
    private String fileName;

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private DownloadService downloadService;

    @GetMapping
    public String getCurrencyPage(Map<String, Object> model) {
        return "currency";
    }

    @GetMapping("/download")
    public StreamingResponseBody downloadApp(
            HttpServletResponse response) throws IOException {

        MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, fileName);

        // Content-Type
        response.setContentType(mediaType.getType());

        // Content-Disposition
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + fileName);

        File file = new File(uploadPath + "/" + fileName);

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

            addDownloaderCounter(fileName);
        };
    }

    synchronized private void addDownloaderCounter(String fileName) {
        downloadService.saveCounter(fileName);
    }
}
