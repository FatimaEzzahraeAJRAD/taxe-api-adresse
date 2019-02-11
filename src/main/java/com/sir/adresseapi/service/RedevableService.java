/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service;

import com.sir.adresseapi.bean.Redevable;
import java.util.List;

/**
 *
 * @author user
 */
public interface RedevableService {
        public Redevable findByCin(String cin);
        public int creer(Redevable redevable);
        public List<Redevable> findAll();
        public boolean existsById(Long id);
}
