package ua.com.poseal.mysite.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import ua.com.poseal.mysite.service.DownloadService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/nutrition")
public class AppNutritionController extends DownloadController{

    @Value("${app.nutrition.filename}")
    private String fileName;

    public AppNutritionController(ServletContext servletContext, DownloadService downloadService) {
        super(servletContext, downloadService);
    }

    @Override
    public StreamingResponseBody downloadApp(HttpServletResponse response, String fileName) throws IOException {
        return super.downloadApp(response, this.fileName);
    }

    @GetMapping
    public String getNutritionPage() {
        return "nutrition";
    }
}
