/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.service;

import com.sir.adresseapi.bean.Local;
import java.util.List;

/**
 *
 * @author user
 */
public interface LocalService {
     public List<Local> findByRedevableCin(String reference);
    public Local findByReference(String reference);
    public int creer(Local local);
     public List<Local> findAll();
}
