package com.young.young_progress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/accueil")
    public String accueil() {
        return "test"; // Cela renvoie vers un fichier HTML dans /resources/templates/accueil.html
    }
}
