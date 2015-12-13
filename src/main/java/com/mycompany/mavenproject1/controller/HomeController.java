/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.entity.Ankieta;
import com.mycompany.mavenproject1.entity.Pytanie;
import com.mycompany.mavenproject1.service.AnkietaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ryszard.mroczka
 */
@Controller
public class HomeController {

    //private final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    AnkietaService ankietaService;

    @RequestMapping("/")
    public String przykladModelu(Model model) {
        //logger.debug("hello() is executed - $name {}", model);
        model.addAttribute("message", "To jest jakaś super informacja");

        Ankieta ankieta = new Ankieta();
        ankieta.setName("Ankieta");

        for (int i = 0; i < 10; i++) {
            Pytanie pytanie = new Pytanie();
            pytanie.setName("pytanie" + i);
            pytanie.setAnkieta(ankieta);
            ankieta.getPytania().add(pytanie);
        }

        ankietaService.save(ankieta);
        
        model.addAttribute("ankieta", ankieta);

        //emailService.sendTextEmail("ryszard693@gmail.com", "temat", "wiadomosc");
        return "home";
    }

}
