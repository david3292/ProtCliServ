/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.test;

import com.espe.distribuidas.pmaldito.cliente.InformacionClienteRQ;
import com.espe.distribuidas.pmaldito.cliente.InformacionClienteRS;
import com.espe.distribuidas.pmaldito.originador.Originador;
import com.espe.distribuidas.pmaldito.pcs.Mensaje;
import com.espe.distribuidas.pmaldito.pcs.MensajeRQ;
import com.espe.distribuidas.pmaldito.pcs.MensajeRS;
import com.espe.distribuidas.pmaldito.seguridad.AutenticacionRQ;
import com.espe.distribuidas.pmaldito.seguridad.AutenticacionRS;
import com.espe.distribuidas.pmaldito.validaCliente.validaClienteRQ;

/**
 *
 * @author david
 */
public class Test {

    public static void main(String[] args) {

//---------------Peticion autenticacion usuario--------------------------------
        AutenticacionRQ aurq = new AutenticacionRQ();
        aurq.setUsuario("David");
        aurq.setClave("1234");
        MensajeRQ maurq = new MensajeRQ(Originador.CLIENTE, Mensaje.AUTENTIC_USER);
        maurq.setCuerpo(aurq);
        System.out.println("Peticion Autenticacion " + maurq.asTexto());
        
//---------------Respuesta autenticacion usuario--------------------------------        
        AutenticacionRS autrs = new AutenticacionRS();
        autrs.build("RQ192.168.1.103@B0000020151121111456325INSERTABDD0002e0aa021e21dddbd6d8cecec71e9cf564OK");        
        MensajeRS mautrs = new MensajeRS(Originador.BASE_DATOS, Mensaje.AUTENTIC_USER);
        mautrs.setCuerpo(autrs);
        System.out.println("Respuesta Autenticacion" + mautrs.asTexto());
        
//---------------Peticion informacion usuario--------------------------------        
        InformacionClienteRQ infcrq = new InformacionClienteRQ();
        infcrq.setTipoDocumento(InformacionClienteRQ.CEDULA);
        infcrq.setValor("1717965691");
        MensajeRQ minfcrq = new MensajeRQ(Originador.CLIENTE, Mensaje.INFO_CLIENT);
        minfcrq.setCuerpo(infcrq);
        System.out.println("Peticion informacion Cliente" + minfcrq.asTexto());
        
//---------------Peticion informacion usuario--------------------------------        
//        InformacionClienteRS infcrs = new InformacionClienteRS();
//        infcrs.build("RQ192.168.1.103@B0000020151121111456325INSERTABDD0002e0aa021e21dddbd6d8cecec71e9cf564OK");
        
//-----------------------------------------------------------------------------
        InformacionClienteRQ ic = new InformacionClienteRQ();
        ic.setTipoDocumento("CEDUL");
        ic.setValor("1717965691");
        MensajeRQ mrqic = new MensajeRQ(Originador.getOriginador(Originador.CLIENTE), Mensaje.INFO_CLIENT);
        mrqic.setCuerpo(ic);
        System.out.println(mrqic.asTexto());
        
        System.out.println(mrqic.asTexto().length());
        Mensaje.validaHash(mrqic.asTexto());

        String o = Originador.getOriginador(Originador.CLIENTE);
        System.out.println("ip= "+o);
        
    }

}
