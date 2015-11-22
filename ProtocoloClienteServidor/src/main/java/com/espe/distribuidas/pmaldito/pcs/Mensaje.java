/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.pcs;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author david
 */
public class Mensaje {
    public static final String AUTENTIC_USER = "AUTENTIAPP";
    public static final String INFO_CLIENT = "INFOCLIENT";
    public static final String INSERT_CLIENT = "INSERTCLIE";
    public static final String INFO_PRODUCT = "INFOPRODUC";
    public static final String INSERT_PRODUCT = "INSERTPROD";
    public static final String INFO_FACT = "INFOFACTUR";
    public static final String INSERT_FACT = "INSERTFACT";
    public static final String VALIDA_CLIENT = "VALICLIENT";
    
    public static final String nombreTablaCliente = "CLIENTE";
    /**
     * nombres de la tablas de la base de datos detalle
     */
    public static final String nombreTablaDetalle = "DETALLE";
    /**
     * nombres de la tablas de la base de datos factura
     */
    public static final String nombreTablaFactura = "FACTURA";
    /**
     * nombres de la tablas de la base de datos producto
     */
    public static final String nombreTablaProducto = "PRODUCTO";
    /**
     * nombres de la tablas de la base de datos usuario
     */
    public static final String nombreTablaUsuario = "USUARIO";
    
    public static boolean validaHash (String trama){        
        String cuerpo = trama.substring(85, trama.length());
        String md5HashN = DigestUtils.md5Hex(cuerpo);
        String md5Hash = trama.substring(53, 85);
//        if(md5Hash.equals(md5HashN))
//            System.out.println("correctooooo");
        return md5Hash.equals(md5HashN);
    }
}
