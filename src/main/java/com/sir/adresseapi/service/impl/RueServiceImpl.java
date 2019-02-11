/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service.impl;

import com.sir.adresseapi.bean.Quartier;
import com.sir.adresseapi.bean.Rue;
import com.sir.adresseapi.dao.RueDao;
import com.sir.adresseapi.service.QuartierService;
import com.sir.adresseapi.service.RueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class RueServiceImpl implements RueService{
    
    @Autowired
    RueDao rueDao;
    @Autowired
    QuartierService quartierService;

    @Override
    public List<Rue> findByQuartierReference(String reference) {
        return rueDao.findByQuartierReference(reference);
    }

    @Override
    public Rue findByReference(String reference) {
        return rueDao.findByReference(reference);
    }

    @Override
    public int creer(Rue rue) {
      Quartier q = rue.getQuartier();
             if(quartierService.existsById(q.getId()) == false){
                 return -1;
             }else{
            rueDao.save(rue);
            return 1;
        }
    }
    @Override
    public List<Rue> findAll() {

        return rueDao.findAll();
    }
     @Override
    public boolean existsById(Long id) {
        return rueDao.existsById(id);
    }
    
    public RueDao getRueDao() {
        return rueDao;
    }

    public void setRueDao(RueDao rueDao) {
        this.rueDao = rueDao;
    }

    public QuartierService getQuartierService() {
        return quartierService;
    }

    public void setQuartierService(QuartierService quartierService) {
        this.quartierService = quartierService;
    }

   

   
    
}
