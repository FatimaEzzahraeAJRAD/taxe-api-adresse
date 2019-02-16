/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.vo;

/**
 *
 * @author user
 */

public class LocalVo{
    
    private Long id;
    private String reference;
    private String surface;
    private RedevableVo redevableVo;
    private RedevableVo proprietaireVo;
    private RueVo rueVo;
    private String dernierMontantPaye ;
    private String dernierTrimestrePaye ;
    private String dernierAnneePaye ;
    private String refCategorie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public RedevableVo getRedevableVo() {
        return redevableVo;
    }

    public void setRedevableVo(RedevableVo redevableVo) {
        this.redevableVo = redevableVo;
    }

    public RedevableVo getProprietaireVo() {
        return proprietaireVo;
    }

    public void setProprietaireVo(RedevableVo proprietaireVo) {
        this.proprietaireVo = proprietaireVo;
    }

    public RueVo getRueVo() {
        return rueVo;
    }

    public void setRueVo(RueVo rueVo) {
        this.rueVo = rueVo;
    }

   

    public String getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(String dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public String getDernierTrimestrePaye() {
        return dernierTrimestrePaye;
    }

    public void setDernierTrimestrePaye(String dernierTrimestrePaye) {
        this.dernierTrimestrePaye = dernierTrimestrePaye;
    }

    public String getDernierAnneePaye() {
        return dernierAnneePaye;
    }

    public void setDernierAnneePaye(String dernierAnneePaye) {
        this.dernierAnneePaye = dernierAnneePaye;
    }

    public String getRefCategorie() {
        return refCategorie;
    }

    public void setRefCategorie(String refCategorie) {
        this.refCategorie = refCategorie;
    }

    
    
}
