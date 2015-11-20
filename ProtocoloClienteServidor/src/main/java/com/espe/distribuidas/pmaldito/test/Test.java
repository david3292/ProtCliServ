/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.test;

import com.espe.distribuidas.pmaldito.cliente.InformacionClienteRQ;
import com.espe.distribuidas.pmaldito.originador.Originador;
import com.espe.distribuidas.pmaldito.pcs.MensajeRQ;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Test {

    public static void main(String[] args) {

        InformacionClienteRQ ic = new InformacionClienteRQ();
        ic.setTipoDocumento("CEDUL");
        ic.setValor("1717965691");
        MensajeRQ mrqic = new MensajeRQ(Originador.getOriginador(Originador.CLIENTE), "INFONCLI");
        mrqic.setCuerpo(ic);
        System.out.println(mrqic.asTexto());

        String o = Originador.getOriginador(Originador.CLIENTE);
        System.out.println("ip= "+o);
    }

}
