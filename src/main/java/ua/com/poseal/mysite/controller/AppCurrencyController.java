package ua.com.poseal.mysite.controller;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.SuppressAjWarnings;
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
import java.time.LocalDateTime;
import java.util.Map;

@Controller
@RequestMapping("/currency")
@Slf4j
public class AppCurrencyController {

    @Value("${upload.path}")
    private String uploadPath;
    @Value("${app.currency.filename}")
    private String fileName;

    private final ServletContext servletContext;

    private final DownloadService downloadService;

    @Autowired
    public AppCurrencyController(ServletContext servletContext, DownloadService downloadService) {
        this.servletContext = servletContext;
        this.downloadService = downloadService;
    }

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
        log.info("{} was downloaded at {}", fileName, LocalDateTime.now());
    }
}
