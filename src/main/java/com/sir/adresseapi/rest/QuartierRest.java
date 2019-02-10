/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest;

import com.sir.adresseapi.bean.Quartier;
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
@RequestMapping({"/adresse-api/quartier"})
public class QuartierRest {
    @Autowired
    QuartierService quartierService;
    
    @GetMapping("/sec/{reference}")
    public List<Quartier> findBySecteurReference(@PathVariable String reference) {
        return quartierService.findBySecteurReference(reference);
    }
    @GetMapping("/reference/{reference}")
    public Quartier findByReference(@PathVariable String reference) {
        return quartierService.findByReference(reference);
    }
   
    @PostMapping("/")
    public int creer(@RequestBody Quartier quartier) {
        return quartierService.creer(quartier);
    }
    @GetMapping("/all")
    public List<Quartier> findAll() {
        return quartierService.findAll();
    }
    

    public QuartierService getQuartierService() {
        return quartierService;
    }

    public void setQuartierService(QuartierService quartierService) {
        this.quartierService = quartierService;
    }
    
   
  
  
    
}
