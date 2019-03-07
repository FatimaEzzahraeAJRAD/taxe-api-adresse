/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Quartier;
import com.sir.adresseapi.rest.vo.QuartierVo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


/**
 *
 * @author YOUNES
 */
@Component
public class QuartierConverter extends AbstractConverter<Quartier, QuartierVo>{

     public Quartier toItem(QuartierVo vo) {
         
        if (vo != null) {
            Quartier item = new Quartier();
             
              if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getReference()!= null) {
                item.setReference(vo.getReference());
            }
             if (vo.getSecteurVo()!= null) {
                 item.setSecteur(new SecteurConverter().toItem(vo.getSecteurVo()));
            } 
            return item;
        }
        return null;
    }

    public QuartierVo toVo (Quartier item) {
        
        if (item != null) {
            QuartierVo vo = new QuartierVo();
        if(item.getId()!=null){
                vo.setId(item.getId());
            }
            if (item.getReference()!= null) {
                vo.setReference(item.getReference());
            }
              if (item.getSecteur()!= null) {
                 vo.setSecteurVo(new SecteurConverter().toVo(item.getSecteur()));
            } 
            return vo;
        }
       return null;
    }

   
}
