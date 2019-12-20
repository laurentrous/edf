package com.wcs.edf.controllers;

import com.wcs.edf.entity.Actualite;
import com.wcs.edf.repository.ActualiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class controller {

    @Autowired
    private ActualiteRepository actualiteRepository;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/fil")
    public String timeline() {
        return "fil";
    }

    @GetMapping("/articles")
    public String article(Model model) {
        List<Actualite> actualites = new ArrayList<>();
        actualites = actualiteRepository.findAll();
        model.addAttribute("actualites", actualites);
        /*
        Optional<Actualite> optionalActualite = actualiteRepository.findById(1L);
        if(optionalActualite.isPresent()){
            Actualite actualite = optionalActualite.get();
            model.addAttribute("actualite", actualite);
        }

         */
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

    @GetMapping("/hydrogene-environnement")
    public String hydroEnv() {
        return "hydro-environnement";
    }

    @GetMapping("/questionnaire")
    public String question() {
        return "questionnaire";
    }
}
