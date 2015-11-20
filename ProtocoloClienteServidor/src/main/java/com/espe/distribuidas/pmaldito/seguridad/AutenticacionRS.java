package com.espe.distribuidas.pmaldito.seguridad;
/**
 * 
 */

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import org.apache.commons.lang3.StringUtils;

/**
 * @author david
 *
 */
public class AutenticacionRS implements Cuerpo{
	
	private String message = "";
	
	
	public void build (String string){
		String usuario = string.substring(85, 95);
		String clave = string.substring(95,105);
		clave = StringUtils.stripEnd(clave, " ");
		System.out.println(usuario+"." + clave);
		
		
	}
	
	@Override
	public String asTexto() {
		return this.message;
	}

}
