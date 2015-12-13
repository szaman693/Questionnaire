/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.dto.FormularzDTO;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author szaman
 */
@Controller
public class FormController {

    @RequestMapping(value = "/formularz", method = RequestMethod.GET)
    public String formularz(Model model) {
        
        model.addAttribute("form", new FormularzDTO());
        return "formularz";
        //return new ModelAndView("formularz", "form", new FormularzDTO());
    }

    @RequestMapping(value = "/formularz", method = RequestMethod.POST)
    public String obsluzFormularz(@ModelAttribute("form") @Valid FormularzDTO form, BindingResult result) {
        if (result.hasErrors()) {
            //formularz nie jest uzupełniony prawidłowo
            return "formularz";
        } else {
            //formularz wypełniony prawidłowo
            return "poformularz";
        }
    }

}
