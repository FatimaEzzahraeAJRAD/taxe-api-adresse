/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Secteur;
import com.sir.adresseapi.rest.vo.QuartierVo;
import com.sir.adresseapi.rest.vo.SecteurVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class SecteurConverter extends AbstractConverter<Secteur, SecteurVo>{

    @Override
    public Secteur toItem(SecteurVo vo) {
       if (vo != null) {
            Secteur item = new Secteur();
            if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getReference() != null) {
                item.setReference(vo.getReference());
            }
            if (vo.getQuartierVos()!= null) {
                 item.setQuartiers(new QuartierConverter().toItem(vo.getQuartierVos()));
            }
            return item;  
        }
        return null;
    }

    @Override
    public SecteurVo toVo(Secteur item) {
  
        if (item != null) {
             SecteurVo vo = new SecteurVo();
            if(item.getId()!=null){
                vo.setId(item.getId());
            }
            if (item.getReference() != null) {
                vo.setReference(item.getReference());
            }
            if (item.getQuartiers()!= null) {
                vo.setQuartierVos(new QuartierConverter().toVo(item.getQuartiers()));
            }
           return vo;
        }
        return null;
    }
}
