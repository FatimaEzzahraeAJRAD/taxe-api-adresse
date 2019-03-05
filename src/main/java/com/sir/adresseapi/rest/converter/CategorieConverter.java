/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;
import com.sir.adresseapi.bean.Categorie;
import com.sir.adresseapi.rest.vo.CategorieVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jawadoo
 */
@Component
public class CategorieConverter  extends AbstractConverter<Categorie, CategorieVo>{
    
     @Override
    public Categorie toItem(CategorieVo vo) {
        if (vo == null) {
            return null;
        } else {
            Categorie item = new Categorie();
            item.setId(vo.getId());
            item.setLibelle(vo.getLibelle());
            item.setRefCategorie(vo.getRefCategorie());
            
            return item;
        }
    }
     @Override
    public CategorieVo toVo(Categorie item) {
        if (item == null) {
            return null;
        } else {
            CategorieVo vo = new CategorieVo();
            vo.setId(item.getId());
            vo.setLibelle(item.getLibelle());
            vo.setRefCategorie(item.getRefCategorie());
            return vo;
        }
    }
    
}
