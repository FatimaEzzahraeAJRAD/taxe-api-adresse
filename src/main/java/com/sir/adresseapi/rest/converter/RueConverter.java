/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Rue;
import com.sir.adresseapi.rest.vo.RueVo;
import org.springframework.stereotype.Component;



/**
 *
 * @author YOUNES
 */
@Component
public class RueConverter extends AbstractConverter<Rue, RueVo>{

    @Override
    public Rue toItem(RueVo vo) {
        
        if (vo != null) {
            Rue item = new Rue();
             
              if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getReference()!= null) {
                item.setReference(vo.getReference());
            }
             if (vo.getLocalVos()!= null) {
                 item.setLocals(new LocalConverter().toItem(vo.getLocalVos()));
            } 
            return item;
        }
        return null;
    }

    @Override
    public RueVo toVo(Rue item) {
       if (item != null) {
            RueVo vo = new RueVo();
        if(item.getId()!=null){
                vo.setId(item.getId());
            }
            if (item.getReference()!= null) {
                vo.setReference(item.getReference());
            }
             if (item.getLocals()!= null) {
                 vo.setLocalVos(new LocalConverter().toVo(item.getLocals()));
            } 
            return vo;
        }
       return null;
    }

  
}
