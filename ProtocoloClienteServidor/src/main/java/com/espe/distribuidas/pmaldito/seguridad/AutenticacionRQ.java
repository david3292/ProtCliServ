package com.espe.distribuidas.pmaldito.seguridad;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;
import org.apache.commons.lang3.StringUtils;



public class AutenticacionRQ implements Cuerpo{
	private String usuario;
	private String clave;
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = StringUtils.rightPad(usuario, 10);
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = StringUtils.rightPad(clave, 10);;
	}
	@Override
	public String asTexto() {
		// TODO Auto-generated method stub
		return this.usuario + this.clave;
	}
	
	
}
