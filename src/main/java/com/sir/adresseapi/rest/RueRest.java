/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest;

import com.sir.adresseapi.bean.Quartier;
import com.sir.adresseapi.bean.Rue;
import com.sir.adresseapi.service.QuartierService;
import com.sir.adresseapi.service.RueService;
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
@RequestMapping({"/adresse-api/rue"})
public class RueRest {
    @Autowired
    RueService rueService;

    @GetMapping("/qua/{reference}")
    public List<Rue> findByQuartierReference(@PathVariable String reference) {
        return rueService.findByQuartierReference(reference);
    }

    @GetMapping("/reference/{reference}")
    public Rue findByReference(@PathVariable String reference) {
        return rueService.findByReference(reference);
    }

    @PostMapping("/")
    public int creer(@RequestBody Rue rue) {
        return rueService.creer(rue);
    }
      @GetMapping("/all")
    public List<Rue> findAll() {
        return rueService.findAll();
    }

    

    
}
