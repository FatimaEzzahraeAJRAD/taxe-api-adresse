/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Local;
import com.sir.adresseapi.common.util.NumberUtil;
import com.sir.adresseapi.rest.vo.LocalVo;
import org.springframework.stereotype.Component;



/**
 *
 * @author YOUNES
 */
@Component
public class LocalConverter extends AbstractConverter<Local, LocalVo>{

    @Override
    public Local toItem(LocalVo vo) {
          
        if (vo != null) {
            Local item = new Local();
             
              if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getReference()!= null) {
                item.setReference(vo.getReference());
            }
           
            if (vo.getDernierMontantPaye()!= null) {
                item.setDernierMontantPaye(NumberUtil.toBigDecimal(vo.getDernierMontantPaye()));
            }
            if (vo.getDernierAnneePaye()!= null) {
                item.setDernierAnneePaye(NumberUtil.toBigDecimal(vo.getDernierAnneePaye()));
            } 
            if (vo.getDernierTrimestrePaye()!= null) {
                item.setDernierTrimestrePaye(NumberUtil.toBigDecimal(vo.getDernierTrimestrePaye()));
            }
            if(vo.getRefCategorie()!= null){
                item.setRefCategorie(vo.getRefCategorie());
            }      
            if(vo.getSurface()!= null){
                item.setSurface(NumberUtil.toBigDecimal(vo.getSurface()));
            }
            return item;
        }
        return null;
    }

    @Override
    public LocalVo toVo(Local item) {
          if (item != null) {
            LocalVo vo = new LocalVo();
             
              if(item.getId()!=null){
                vo.setId(vo.getId());
            }
            if (item.getReference()!= null) {
                vo.setReference(item.getReference());
            }
           
            if (item.getDernierMontantPaye()!= null) {
                vo.setDernierMontantPaye(NumberUtil.toString(item.getDernierMontantPaye()));
            }
            if (item.getDernierAnneePaye()!= null) {
                vo.setDernierAnneePaye(NumberUtil.toString(item.getDernierAnneePaye()));
            } 
            if (item.getDernierTrimestrePaye()!= null) {
                vo.setDernierTrimestrePaye(NumberUtil.toString(item.getDernierTrimestrePaye()));
            }
            if(item.getRefCategorie()!= null){
                vo.setRefCategorie(vo.getRefCategorie());
            }      
            if(item.getSurface()!= null){
                vo.setSurface(NumberUtil.toString(item.getSurface()));
            }
            return vo;
        }
        return null;
    }

    

}
