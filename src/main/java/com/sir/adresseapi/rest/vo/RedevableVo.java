/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.vo;

import java.util.List;



/**
 *
 * @author user
 */

public class RedevableVo  {
   
   
    private Long id;
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private List<LocalVo> localVos;


      public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

  

    public List<LocalVo> getLocalVos() {
        return localVos;
    }

    public void setLocalVos(List<LocalVo> localVos) {
        this.localVos = localVos;
    }
  
    
}
