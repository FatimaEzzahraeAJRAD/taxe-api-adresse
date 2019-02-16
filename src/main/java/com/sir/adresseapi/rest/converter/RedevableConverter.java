/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Redevable;
import com.sir.adresseapi.rest.vo.RedevableVo;
import org.springframework.stereotype.Component;


/**
 *
 * @author YOUNES
 */
@Component
public class RedevableConverter extends AbstractConverter<Redevable, RedevableVo>{

    @Override
    public Redevable toItem(RedevableVo vo) {
        if (vo != null) {
            Redevable item = new Redevable();
             
              if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getCin()!= null) {
                item.setCin(vo.getCin());
            }
            if (vo.getNom()!= null) {
                item.setNom(vo.getNom());
            }
            if (vo.getPrenom()!= null) {
                item.setPrenom(vo.getPrenom());
            }
            if (vo.getEmail()!= null) {
                item.setEmail(vo.getEmail());
            }
             if (vo.getLocalVos()!= null) {
                 item.setLocals(new LocalConverter().toItem(vo.getLocalVos()));
            } 
             if (vo.getMotDePasse()!= null) {
                item.setMotDePasse(vo.getMotDePasse());
            }
            return item;
        }
        return null;
    }

    @Override
    public RedevableVo toVo(Redevable item) {
         if (item != null) {
            RedevableVo vo = new RedevableVo();
             
              if(item.getId()!=null){
                vo.setId(item.getId());
            }
            if (item.getCin()!= null) {
                vo.setCin(item.getCin());
            }
            if (item.getNom()!= null) {
                vo.setNom(item.getNom());
            }
            if (item.getPrenom()!= null) {
                vo.setPrenom(item.getPrenom());
            }
            if (item.getEmail()!= null) {
                vo.setEmail(item.getEmail());
            }
             if (item.getLocals()!= null) {
                vo.setLocalVos(new LocalConverter().toVo(item.getLocals()));
            } 
             if (item.getMotDePasse()!= null) {
                vo.setMotDePasse(item.getMotDePasse());
            }
            return vo;
        }
        return null;
    }

   

}
