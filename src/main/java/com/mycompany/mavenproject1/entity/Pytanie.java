/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author szaman
 */
@Entity
public class Pytanie implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)   
    private Ankieta ankieta;

    /**
     * Get the value of ankieta
     *
     * @return the value of ankieta
     */
    public Ankieta getAnkieta() {
        return ankieta;
    }

    /**
     * Set the value of ankieta
     *
     * @param ankieta new value of ankieta
     */
    public void setAnkieta(Ankieta ankieta) {
        this.ankieta = ankieta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pytanie)) {
            return false;
        }
        Pytanie other = (Pytanie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pytanie{" + "id=" + id + ", ankieta=" + ankieta + '}';
    }

    
    

}
