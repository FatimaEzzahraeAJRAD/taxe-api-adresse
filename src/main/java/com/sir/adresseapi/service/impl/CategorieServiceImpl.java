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
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author user
 */
@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieDao categoriedao;
    @Autowired
    private CategorieService categorieService;
   

    public int creer(Categorie categorie) {
        if(categorie==null){
            return -1;
        }
        else{
            categoriedao.save(categorie);
            return 1;
        }
    }
  
//    public List<Categorie> findAll() {
//        return categoriedao.findAll();
//    }
   

    @Override
    public Categorie findByRefCategorie(String refCategorie) {
        return categoriedao.findByRefCategorie(refCategorie);
    }

    public CategorieDao getCategoriedao() {
        return categoriedao;
    }

    public void setCategoriedao(CategorieDao categoriedao) {
        this.categoriedao = categoriedao;
    }

    

    public CategorieService getCategorieService() {
        return categorieService;
    }

    public void setCategorieService(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    
}
