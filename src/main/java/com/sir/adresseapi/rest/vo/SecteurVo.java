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
public class SecteurVo {
   
   
    private Long id;
    private String reference;
    private List<QuartierVo> quartierVos;

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

    public List<QuartierVo> getQuartierVos() {
        return quartierVos;
    }

    public void setQuartierVos(List<QuartierVo> quartierVos) {
        this.quartierVos = quartierVos;
    }

    
   
  
    
}
