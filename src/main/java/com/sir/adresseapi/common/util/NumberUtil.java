/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.common.util;

import java.math.BigDecimal;

/**
 *
 * @author user
 */
public class NumberUtil {
    
   
     private static final String CHAINE_VIDE=""; 
    
     public static BigDecimal toBigDecimal(String value){
        if(value==null || value.isEmpty()){
            return BigDecimal.ZERO;
        }else{
            return new BigDecimal(value);
        }
    }
    public static String toString(BigDecimal value){
        if(value==null){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
    
     public static Double toDouble(String value){
        if(value==null || value.isEmpty()){
            return 0D;
        }else{
            return Double.valueOf(value);
        }
    }
    public static String doubleToString(Double value){
        if(value==null){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
       public static int toInt(String value){
        if(value==null || value.isEmpty()){
            return 0;
        }else{
            return Integer.getInteger(value);
        }
    }
//    public static String intToString(int value){
//        if(value == null){
//            return CHAINE_VIDE;
//        }else{
//            return String.valueOf(value);
//        }
//    }
//    
    
    
}
