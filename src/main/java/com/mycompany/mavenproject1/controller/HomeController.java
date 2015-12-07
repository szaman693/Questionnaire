/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.dao.AnkietaDao;
import com.mycompany.mavenproject1.entity.Ankieta;
import com.mycompany.mavenproject1.service.EmailService;
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
    AnkietaDao ankietaDao;  
    

    @RequestMapping("/")
    public String przykladModelu(Model model) {        
        //logger.debug("hello() is executed - $name {}", model);
        model.addAttribute("message", "To jest jakaś super informacja");
        
        Ankieta ankieta = new Ankieta();
        ankieta.setName("Adam");
        ankietaDao.zrobCos(ankieta);
        
        //emailService.sendTextEmail("ryszard693@gmail.com", "temat", "wiadomosc");
        
        
        return "home";
    }

}
