package com.wcs.edf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/fil")
    public String timeline() {
        return "fil";
    }

    @GetMapping("/articles")
    public String article() {
        return "article";
    }

    @GetMapping("/projet")
    public String project() {
        return "project";
    }

    @GetMapping("/hydrogene")
    public String hydro() {
        return "hydrogene";
    }

    @GetMapping("/questionaire")
    public String question() {
        return "questionaire";
    }
}
