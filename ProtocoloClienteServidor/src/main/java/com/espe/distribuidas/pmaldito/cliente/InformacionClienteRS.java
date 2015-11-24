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
public class InformacionClienteRS implements Cuerpo{
    
    private static final String CORRECTO = "OKO";
    private static final String INCORRECTO = "BAD";
    private String resultado;
    private String datos = "";
    
    public void build(String cadena){
        if(Mensaje.validaHash(cadena)){
            this.resultado = cadena.substring(85, 88);
            if(this.resultado.equals(InformacionClienteRS.CORRECTO))
                this.datos =  cadena.substring(85);
            else
                this.resultado = InformacionClienteRS.INCORRECTO;
        }
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "InformacionClienteRS{" + "resultado=" + resultado + ", datos=" + datos + '}';
    }

    @Override
    public String asTexto() {
        String string;
        if(this.resultado.equals(InformacionClienteRS.CORRECTO))
            string = this.datos;
        else
            string = InformacionClienteRS.INCORRECTO;
        return string;
    }
    
    
}
