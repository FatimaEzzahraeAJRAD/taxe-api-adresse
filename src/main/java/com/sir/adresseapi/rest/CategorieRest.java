/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest;

import com.sir.adresseapi.bean.Categorie;
import com.sir.adresseapi.rest.converter.AbstractConverter;
import com.sir.adresseapi.rest.converter.CategorieConverter;
import com.sir.adresseapi.rest.vo.CategorieVo;
import com.sir.adresseapi.service.CategorieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"}) 
@RequestMapping({"/taxe-api/categorie"})
public class CategorieRest {
    @Autowired
    CategorieService categorieService;
  @Autowired
  @Qualifier("categorieConverter")
  private AbstractConverter<Categorie,CategorieVo> categorieConverter;
     @PostMapping("/")
    public int creer(@ RequestBody Categorie categorie) {
        return categorieService.creer(categorie);
    }
//    @GetMapping("/")
//    public List<CategorieVo> findAll() {
//        return categorieConverter.toVo(categorieService.findAll());
//    }

    @GetMapping("/refCategorie/{refCategorie}")
    public CategorieVo findByRefCategorie(@PathVariable("refCategorie") String refCategorie) {
        return new CategorieConverter().toVo(categorieService.findByRefCategorie(refCategorie));
    }
   
   public CategorieService getCategorieService() {
        return categorieService;
    }

    public void setCategorieService(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    public AbstractConverter<Categorie, CategorieVo> getCategorieConverter() {
        return categorieConverter;
    }

    public void setCategorieConverter(AbstractConverter<Categorie, CategorieVo> categorieConverter) {
        this.categorieConverter = categorieConverter;
    }
    
}
