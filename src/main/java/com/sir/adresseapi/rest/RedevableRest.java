/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest;

import com.sir.adresseapi.bean.Redevable;
import com.sir.adresseapi.service.RedevableService;
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
@RequestMapping({"/adresse-api/redevable"})
public class RedevableRest {
    @Autowired
    RedevableService redevableService;

    @GetMapping("/cin/{cin}")
    public Redevable findByCin(@PathVariable String cin) {
        return redevableService.findByCin(cin);
    }
    @PostMapping("/")
    public int creer(@RequestBody Redevable redevable) {
        return redevableService.creer(redevable);
    }
    @GetMapping("/all")
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }

    public RedevableService getRedevableService() {
        return redevableService;
    }

    public void setRedevableService(RedevableService redevableService) {
        this.redevableService = redevableService;
    }


   
}
