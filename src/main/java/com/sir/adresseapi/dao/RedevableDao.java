/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.dao;

import com.sir.adresseapi.bean.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface RedevableDao extends JpaRepository<Redevable, Long>{
    public Redevable findByCin(String cin);
}
