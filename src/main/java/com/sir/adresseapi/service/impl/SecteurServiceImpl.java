/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service.impl;

import com.sir.adresseapi.bean.Quartier;
import com.sir.adresseapi.bean.Secteur;
import com.sir.adresseapi.dao.SecteurDao;
import com.sir.adresseapi.service.QuartierService;
import com.sir.adresseapi.service.SecteurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class SecteurServiceImpl implements SecteurService{
    
    @Autowired
    private SecteurDao secteurDao ;
  

    @Override
    public int creer(Secteur secteur) {
        Secteur s=findByReference(secteur.getReference());
        if(s!=null){
            return -1;
        }
        else{
           
            secteurDao.save(secteur);
            return 1;
        }
    }

    @Override
    public Secteur findByReference(String reference) {
        return secteurDao.findByReference(reference);
        
    }

    public SecteurDao getSecteurDao() {
        return secteurDao;
    }

    public void setSecteurDao(SecteurDao secteurDao) {
        this.secteurDao = secteurDao;
    }

    @Override
    public List<Secteur> findAll() {

        return secteurDao.findAll();
    }

    @Override
    public boolean existsById(Long id) {
      
        return secteurDao.existsById(id);
    }

//    @Override
//    public void deleteById(Long id) {
//         secteurDao.deleteById(id);
//    }


}
