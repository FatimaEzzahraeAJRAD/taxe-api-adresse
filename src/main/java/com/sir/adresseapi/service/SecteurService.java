/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service;

import com.sir.adresseapi.bean.Secteur;
import java.util.List;

/**
 *
 * @author user
 */
public interface SecteurService {

    public Secteur findByReference(String reference);
    public List<Secteur> findAll();
    public boolean existsById(Long id);
    public int creer(Secteur secteur);
   // public void deleteById(Long id);

}
