/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service.impl;

import com.sir.adresseapi.bean.Redevable;
import com.sir.adresseapi.dao.RedevableDao;
import com.sir.adresseapi.service.RedevableService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class RedevableServiceImpl implements RedevableService{

    @Autowired
    RedevableDao redevabledao;
    
    @Override
    public Redevable findByCin(String reference) {
        return redevabledao.findByCin(reference);
    }

    @Override
    public  Redevable creer(Redevable redevable) {
        Redevable r = findByCin(redevable.getCin());
        if(r!=null){
            return null;
        }
        else{
            redevabledao.save(redevable);
            return redevable;
        }
    }
   @Override
    public List<Redevable> findAll() {
         return redevabledao.findAll();
    }
    
    public RedevableDao getRedevabledao() {
        return redevabledao;
    }

    public void setRedevabledao(RedevableDao redevabledao) {
        this.redevabledao = redevabledao;
    }

    @Override
    public boolean existsById(Long id) {
        return redevabledao.existsById(id);
    }

 
}
