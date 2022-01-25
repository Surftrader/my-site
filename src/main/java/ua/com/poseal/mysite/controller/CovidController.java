package ua.com.poseal.mysite.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/covid")
public class CovidController {

    @Value("${upload.path}")
    private String uploadPath;
    @Value("${covid.file.mime-type}")
    private String mimeType; // pdf
    @Value("${covid.file}")
    private String fileName; // COVID_Poddubka_24222022

    @GetMapping("/poddubka24012022")
    public Object downloadDocument(
            HttpServletResponse response) throws IOException {

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
}
