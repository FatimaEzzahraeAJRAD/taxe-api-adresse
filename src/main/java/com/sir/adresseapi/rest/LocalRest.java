/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest;

import com.sir.adresseapi.bean.Local;
import com.sir.adresseapi.service.LocalService;
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
@RequestMapping({"/adresse-api/local"})
public class LocalRest {
    
    @Autowired
    LocalService LocalService;

    @GetMapping("/red/{cin}")
    public List<Local> findByRedevableCin(@PathVariable String reference) {
        return LocalService.findByRedevableCin(reference);
    }
   
    @GetMapping("/reference/{reference}")
    public Local findByReference(@PathVariable String reference) {
        return LocalService.findByReference(reference);
    }

    @PostMapping("/")
    public int creer(@RequestBody Local local) {
        return LocalService.creer(local);
    }
    @GetMapping("/all")
    public List<Local> findAll() {
        return LocalService.findAll();
    }

    
    public LocalService getLocalService() {
        return LocalService;
    }

    public void setLocalService(LocalService LocalService) {
        this.LocalService = LocalService;
    }
    
}
