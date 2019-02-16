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

public class RueVo{
     
    private Long id;
    private String reference;
    private QuartierVo quartierVo;
    private List<LocalVo> localVos;

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

    public QuartierVo getQuartierVo() {
        return quartierVo;
    }

    public void setQuartierVo(QuartierVo quartierVo) {
        this.quartierVo = quartierVo;
    }

    public List<LocalVo> getLocalVos() {
        return localVos;
    }

    public void setLocalVos(List<LocalVo> localVos) {
        this.localVos = localVos;
    }

    
}
