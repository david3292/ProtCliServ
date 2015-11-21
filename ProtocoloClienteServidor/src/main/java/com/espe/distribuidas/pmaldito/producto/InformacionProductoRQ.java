/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.producto;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author david
 */
public class InformacionProductoRQ implements Cuerpo{
    
    private String valor;
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = StringUtils.leftPad(valor, 10);
    }

    @Override
    public String asTexto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
    
}
