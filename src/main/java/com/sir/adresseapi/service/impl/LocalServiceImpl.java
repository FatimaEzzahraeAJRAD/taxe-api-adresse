/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service.impl;

import com.sir.adresseapi.bean.Local;
import com.sir.adresseapi.bean.Redevable;
import com.sir.adresseapi.bean.Rue;
import com.sir.adresseapi.dao.LocalDao;
import com.sir.adresseapi.service.LocalService;
import com.sir.adresseapi.service.RedevableService;
import com.sir.adresseapi.service.RueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class LocalServiceImpl implements LocalService{
    @Autowired
    LocalDao localDao;
     @Autowired
    RedevableService redevableService;
    @Autowired
    RueService rueService;
    @Autowired

    @Override
    public List<Local> findByRedevableCin(String reference) {
        return localDao.findByRedevableCin(reference);
    }

   

    @Override
    public Local findByReference(String reference) {
        return localDao.findByReference(reference);
    }

    @Override
    public int creer(Local local) {
        Redevable r= local.getRedevable();
         Redevable p= local.getProprietaire();
        Rue rue=local.getRue();
//        Categorie c= local.getCategorie();
        if(redevableService.existsById(r.getId())==false){
            return -1;
        }else if(redevableService.existsById(p.getId())==false){
            return -2;
        }
        else if(rueService.existsById(rue.getId())==false){
            return -3;
        }
//        else if(categorieService.existsById(c.getId())==false){
//            return -4;
//        }
        else {
              local.setDernierAnneePaye(0);
              local.setDernierTrimestrePaye(0);
              localDao.save(local);
        return 1;
        }
      
    }
       @Override
    public List<Local> findAll() {
        return localDao.findAll();
    }

    public LocalDao getLocalDao() {
        return localDao;
    }

    public void setLocalDao(LocalDao localDao) {
        this.localDao = localDao;
    }

    public RedevableService getRedevableService() {
        return redevableService;
    }

    public void setRedevableService(RedevableService redevableService) {
        this.redevableService = redevableService;
    }

    public RueService getRueService() {
        return rueService;
    }

    public void setRueService(RueService rueService) {
        this.rueService = rueService;
    }

 
    
}
