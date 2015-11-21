package com.espe.distribuidas.pmaldito.seguridad;

/**
 *
 */

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import com.espe.distribuidas.pmaldito.pcs.Mensaje;
import org.apache.commons.lang3.StringUtils;

/**
 * @author david
 *
 */
public class AutenticacionRS implements Cuerpo {
    
    private static final String CORRECTO = "OK";
    private static final String INCORRECTO = "NO";
    
    private String message;

    public void build(String string) {
        if (string.length() == 87 && Mensaje.validaHash(string)) {
            this.message = string.substring(85, 87);
            this.message = this.message.equals(AutenticacionRS.CORRECTO)? AutenticacionRS.CORRECTO : AutenticacionRS.INCORRECTO;
        }else
            this.message = AutenticacionRS.INCORRECTO;
    }

    @Override
    public String asTexto() {
        return this.message;
    }

}
