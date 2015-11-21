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
public class InformacionFacturaRS implements Cuerpo{
    private static final String CORRECTO = "OKO";
    private static final String INCORRECTO = "BAD";
    private String resultado;
    private String datos;
    
    public void build(String string){
        this.datos = string;
        if(Mensaje.validaHash(string)){
            this.resultado = string.substring(85, 88);
            this.resultado = this.resultado.equals(InformacionFacturaRS.CORRECTO)?InformacionFacturaRS.CORRECTO:InformacionFacturaRS.INCORRECTO;
        }else
            this.resultado = InformacionFacturaRS.INCORRECTO;
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
        return "InformacionFacturaRS{" + "resultado=" + resultado + ", datos=" + datos + '}';
    }

    @Override
    public String asTexto() {
        String cuerpo;
        cuerpo = this.resultado.equals(InformacionFacturaRS.CORRECTO)?this.datos:this.resultado;
        return cuerpo;
    }
    
    
}
