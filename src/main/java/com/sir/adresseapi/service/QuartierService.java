/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service;

import com.sir.adresseapi.bean.Quartier;
import java.util.List;

/**
 *
 * @author user
 */
public interface QuartierService {
    
    public List<Quartier> findBySecteurReference(String reference);
    public Quartier findByReference(String reference);
    public int creer(Quartier quartier);
    public List<Quartier> findAll();
    public boolean existsById(Long id);
    
}
