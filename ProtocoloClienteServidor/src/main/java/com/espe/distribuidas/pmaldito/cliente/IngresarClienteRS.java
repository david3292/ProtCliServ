/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.cliente;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import com.espe.distribuidas.pmaldito.pcs.Mensaje;

/**
 *
 * @author david
 */
public class IngresarClienteRS implements Cuerpo{
    private static final String CORRECTO = "OK";
    private static final String INCORRECTO = "NO";
    private String message;
    
    public void build(String string){
        if (string.length() == 87 && Mensaje.validaHash(string)) {
            this.message = string.substring(85, 87);
            this.message = this.message.equals(IngresarClienteRS.CORRECTO)? IngresarClienteRS.CORRECTO : IngresarClienteRS.INCORRECTO;
        }else
            this.message = IngresarClienteRS.INCORRECTO;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "IngresarClienteRS{" + "message=" + message + '}';
    }

    @Override
    public String asTexto() {
        return this.message;
    }
    
}