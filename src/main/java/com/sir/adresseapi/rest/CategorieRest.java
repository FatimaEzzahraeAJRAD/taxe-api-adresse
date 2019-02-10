/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest;

import com.sir.adresseapi.bean.Categorie;
import com.sir.adresseapi.service.CategorieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping({"/adresse-api/categorie"})
public class CategorieRest {
    @Autowired
    CategorieService categorieService;

    @GetMapping("/reference/{reference}")
    public Categorie findByReference(@PathVariable String reference) {
        return categorieService.findByReference(reference);
    }
    @PostMapping("/")
    public int creer(@RequestBody Categorie categorie) {
        return categorieService.creer(categorie);
    }
    @GetMapping("/all")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    public CategorieService getCategorieService() {
        return categorieService;
    }

    public void setCategorieService(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

  
    
}
