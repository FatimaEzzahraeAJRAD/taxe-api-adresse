/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest;

import com.sir.adresseapi.bean.Redevable;
import com.sir.adresseapi.rest.converter.RedevableConverter;
import com.sir.adresseapi.rest.vo.RedevableVo;
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
@RequestMapping({"/taxe-api-souk/redevable"})
public class RedevableRest {
    @Autowired
    RedevableService redevableService;

    @GetMapping("/reference/{reference}")
    public RedevableVo findByCin(@PathVariable String reference) {
        return  new RedevableConverter().toVo(redevableService.findByCin(reference));
    }
    @PostMapping("/")
    public RedevableVo creer(@RequestBody RedevableVo redevableVo) {
          RedevableConverter redevableConverter =new RedevableConverter();
        Redevable myRedevable = redevableConverter.toItem(redevableVo);
        Redevable redevable =redevableService.creer(myRedevable);
        return redevableConverter.toVo(redevable);
    }
    @GetMapping("/all")
    public List<RedevableVo> findAll() {
        return new RedevableConverter().toVo(redevableService.findAll());
    }

    public RedevableService getRedevableService() {
        return redevableService;
    }

    public void setRedevableService(RedevableService redevableService) {
        this.redevableService = redevableService;
    }


   
}
