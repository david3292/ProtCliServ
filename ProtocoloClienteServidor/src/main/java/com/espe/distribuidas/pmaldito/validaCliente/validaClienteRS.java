/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.validaCliente;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;

/**
 *
 * @author david
 */
public class validaClienteRS implements Cuerpo{
    private String respuesta;

    public validaClienteRS(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "validaClienteRS{" + "respuesta=" + respuesta + '}';
    }

    @Override
    public String asTexto() {
        return this.respuesta;
    }
    
    
}
