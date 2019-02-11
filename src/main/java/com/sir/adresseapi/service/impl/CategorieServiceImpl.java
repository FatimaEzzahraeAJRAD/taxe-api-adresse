/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service.impl;

import com.sir.adresseapi.bean.Categorie;
import com.sir.adresseapi.dao.CategorieDao;
import com.sir.adresseapi.service.CategorieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class CategorieServiceImpl implements CategorieService{

    @Autowired
    CategorieDao categoriedao;
    
    @Override
    public Categorie findByReference(String reference) {
        return categoriedao.findByReference(reference);
    }

    @Override
    public int creer(Categorie categorie) {
        Categorie c= findByReference(categorie.getReference());
        if(c!=null){
            return -1;
        }else{
            categoriedao.save(categorie);
            return 1;
        }
    }
  @Override
    public List<Categorie> findAll() {
        return categoriedao.findAll();
    }
    public CategorieDao getCategoriedao() {
        return categoriedao;
    }

    public void setCategoriedao(CategorieDao categoriedao) {
        this.categoriedao = categoriedao;
    }

    @Override
    public boolean existsById(Long id) {
       return categoriedao.existsById(id);
    }

  
   
}
