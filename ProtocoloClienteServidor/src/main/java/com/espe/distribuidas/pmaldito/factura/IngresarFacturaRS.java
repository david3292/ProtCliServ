/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.factura;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import com.espe.distribuidas.pmaldito.pcs.Mensaje;

/**
 *
 * @author david
 */
public class IngresarFacturaRS implements Cuerpo{
    private static final String CORRECTO = "OK";
    private static final String INCORRECTO = "NO";
    private String resultado;
    
    public void build(String string){
        if(string.length() == 87 && Mensaje.validaHash(string))
            this.resultado = string.substring(85, 87);        
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "IngresarFacturaRS{" + "resultado=" + resultado + '}';
    }

    @Override
    public String asTexto() {
        return this.resultado;
    }
    
    
}
