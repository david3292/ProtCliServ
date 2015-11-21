/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.validaCliente;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author david
 */
public class validaClienteRQ implements Cuerpo{

    private String valorDocumento;

    public validaClienteRQ(String valorDocumento) {
        this.valorDocumento = StringUtils.leftPad(valorDocumento, 15, "0");
    }

    @Override
    public String toString() {
        return "validaClienteRQ{" + "valorDocumento=" + valorDocumento + '}';
    }

    
    @Override
    public String asTexto() {
        return this.valorDocumento;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(String valorDocumento) {
        this.valorDocumento = StringUtils.leftPad(valorDocumento, 15, "0");
    }
    
}
