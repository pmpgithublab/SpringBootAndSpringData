package ua.training.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping(value = "/main")
    public String main() {
        return "index";
    }

}
