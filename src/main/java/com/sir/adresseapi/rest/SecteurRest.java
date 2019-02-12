/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest;

import com.sir.adresseapi.bean.Secteur;
import com.sir.adresseapi.service.LocalService;
import com.sir.adresseapi.service.QuartierService;
import com.sir.adresseapi.service.RueService;
import com.sir.adresseapi.service.SecteurService;
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
@RequestMapping({"/adresse-api/secteur"})
public class SecteurRest {
    @Autowired
    SecteurService secteurService;
    @GetMapping("/reference/{reference}")
    public Secteur findByReference(@PathVariable String reference) {
        return secteurService.findByReference(reference);
    }
    @PostMapping("/")
    public int creer(@RequestBody Secteur secteur) {
        return secteurService.creer(secteur);
    }

    @GetMapping("/all")
    public List<Secteur> findAll() {
        return secteurService.findAll();
    }
//    @PostMapping("/del")
//    public void deleteById(Long id) {
//        secteurService.deleteById(id);
//    }

    public SecteurService getSecteurService() {
        return secteurService;
    }

    public void setSecteurService(SecteurService secteurService) {
        this.secteurService = secteurService;
    }
  
    
}
