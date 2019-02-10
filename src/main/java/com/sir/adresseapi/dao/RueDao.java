/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.dao;

import com.sir.adresseapi.bean.Rue;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface RueDao extends JpaRepository<Rue, Long>{
      public List<Rue> findByQuartierReference(String reference);
    public Rue findByReference(String reference);

}
