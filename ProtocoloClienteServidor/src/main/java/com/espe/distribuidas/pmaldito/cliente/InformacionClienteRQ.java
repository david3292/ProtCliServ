/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.cliente;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author david
 */
public class InformacionClienteRQ implements Cuerpo{
    
    public static final String PASAPORTE = "PASSP";
    public static final String CEDULA = "CEDUL";
    public static final String RUC = "RUC00";
            
    private String TipoDocumento;
    private String valor;

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = StringUtils.leftPad(valor, 15, "0");
    }

    @Override
    public String toString() {
        return "InformacionCliente{" + "TipoDocumento=" + TipoDocumento + ", valor=" + valor + '}';
    }

    @Override
    public String asTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.TipoDocumento);
        sb.append(this.valor);
        return sb.toString();
    }
    
}
