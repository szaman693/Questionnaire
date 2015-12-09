/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ryszard.mroczka
 */
@Entity
public class Ankieta implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="ankieta")
    private List<Pytanie> pytania;

    public Ankieta() {
        pytania = new ArrayList<>();
    }

    
    
    /**
     * Get the value of pytania
     *
     * @return the value of pytania
     */
    public List<Pytanie> getPytania() {
        return pytania;
    }

    /**
     * Set the value of pytania
     *
     * @param pytania new value of pytania
     */
    public void setPytania(List<Pytanie> pytania) {
        this.pytania = pytania;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(object instanceof Ankieta)) {
            return false;
        }
        Ankieta other = (Ankieta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.entity.Ankieta[ id=" + id + " ]";
    }

}
