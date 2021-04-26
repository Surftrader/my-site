package ua.com.poseal.mysite.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import ua.com.poseal.mysite.service.DownloadService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

@Slf4j
public class DownloadController {

    @Value("${upload.path}")
    private String uploadPath;
    private final ServletContext servletContext;
    private final DownloadService downloadService;

    @Autowired
    public DownloadController(ServletContext servletContext, DownloadService downloadService) {
        this.servletContext = servletContext;
        this.downloadService = downloadService;
    }

    @GetMapping("/download")
    public StreamingResponseBody downloadApp(
            HttpServletResponse response, String fileName) throws IOException {

//        MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, fileName);
//        MediaType mediaType = MediaType.asMediaType(MimeType.valueOf("application/vnd.android.package-archive"));
//        MediaType mediaType = MediaType.parseMediaType("application/vnd.android.package-archive");

        // Content-Type
//        response.setContentType(mediaType.getType());
        response.setContentType("application/vnd.android.package-archive");

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
