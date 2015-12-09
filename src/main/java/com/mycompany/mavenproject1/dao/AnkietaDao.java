/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.entity.Ankieta;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author ryszard.mroczka
 */
@Component
public class AnkietaDao {    
    
    private static final Logger log = LoggerFactory.getLogger(AnkietaDao.class);  
    

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void save(Ankieta ankieta) {
        
        log.info("save ankieta");
        
        entityManager.persist(ankieta);
    }

}
