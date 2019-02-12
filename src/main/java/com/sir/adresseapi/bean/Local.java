/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author user
 */
@Entity
public class Local implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Double surface;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Redevable proprietaire;
    @ManyToOne
    private Rue rue;
    private Double dernierMontantPaye = 0D;
    private int dernierTrimestrePaye ;
    private int dernierAnneePaye ;
    private String refCategorie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }
    
    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Redevable getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Redevable proprietaire) {
        this.proprietaire = proprietaire;
    }
    

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    public String getRefCategorie() {
        return refCategorie;
    }

    public void setRefCategorie(String refCategorie) {
        this.refCategorie = refCategorie;
    }

    public Double getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(Double dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public int getDernierTrimestrePaye() {
        return dernierTrimestrePaye;
    }

    public void setDernierTrimestrePaye(int dernierTrimestrePaye) {
        this.dernierTrimestrePaye = dernierTrimestrePaye;
    }

    public int getDernierAnneePaye() {
        return dernierAnneePaye;
    }

    public void setDernierAnneePaye(int dernierAnneePaye) {
        this.dernierAnneePaye = dernierAnneePaye;
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
        if (!(object instanceof Local)) {
            return false;
        }
        Local other = (Local) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.adresseapi.bean.Local[ id=" + id + " ]";
    }
    
}
