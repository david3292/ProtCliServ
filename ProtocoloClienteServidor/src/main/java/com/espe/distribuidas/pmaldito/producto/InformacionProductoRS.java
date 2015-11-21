/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.producto;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import com.espe.distribuidas.pmaldito.pcs.Mensaje;

/**
 *
 * @author david
 */
public class InformacionProductoRS implements Cuerpo{
    private static final String CORRECTO = "OKO";
    private static final String INCORRECTO = "BAD";
    private String resultado;
    private String datos;
    
    public void build(String string){
        if(Mensaje.validaHash(string)){
            this.resultado = string.substring(85, 88);
            this.resultado = this.resultado.equals(InformacionProductoRS.CORRECTO)?InformacionProductoRS.CORRECTO:InformacionProductoRS.INCORRECTO;
        }else
            this.resultado = InformacionProductoRS.INCORRECTO;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "InformacionProductoRS{" + "resultado=" + resultado + '}';
    }

    @Override
    public String asTexto() {
        String cuerpo;
        if(this.resultado.equals(InformacionProductoRS.CORRECTO))
            cuerpo = this.datos;
        else
            cuerpo = this.resultado;
        
        return cuerpo;
    }
    
    
}
