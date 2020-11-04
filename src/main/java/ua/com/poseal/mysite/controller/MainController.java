package ua.com.poseal.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String getOne(Map<String, Object> model) {
        return "main";
    }

    @GetMapping("profile")
    public String getProfile(Map<String, Object> model) {
        return "profile";
    }
}
