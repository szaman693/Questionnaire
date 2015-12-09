/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.service;

import com.mycompany.mavenproject1.dao.AnkietaDao;
import com.mycompany.mavenproject1.entity.Ankieta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ryszard.mroczka
 */
@Service
public class AnkietaService {
    
    @Autowired
    AnkietaDao ankietaDao;

    public void save(Ankieta ankieta) {
        ankietaDao.save(ankieta);
    }
      
    
}
