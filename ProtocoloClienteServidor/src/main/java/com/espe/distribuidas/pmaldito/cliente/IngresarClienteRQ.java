/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.cliente;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;

/**
 *
 * @author david
 */
public class IngresarClienteRQ implements Cuerpo{
    
    private int codigo;
    private String tipoDocumento;
    private String valorDocumento;
    private String nombre;
    private String apellido;
    private String direccion;
    private String numeroTelefono;
    private String numeroMovil;
    private String correo;
    private String fechaNacimiento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(String valorDocumento) {
        this.valorDocumento = valorDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(String numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "IngresarClienteRQ{" + "codigo=" + codigo + ", tipoDocumento=" + tipoDocumento + ", valorDocumento=" + valorDocumento + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", numeroTelefono=" + numeroTelefono + ", numeroMovil=" + numeroMovil + ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    @Override
    public String asTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.codigo);
        sb.append("_").append(this.tipoDocumento);
        sb.append("-").append(this.valorDocumento);
        sb.append("-").append(this.nombre);
        sb.append("-").append(this.apellido);
        sb.append("-").append(this.direccion);
        sb.append("-").append(this.numeroTelefono);
        sb.append("-").append(this.numeroMovil);
        sb.append("-").append(this.correo);
        sb.append("-").append(this.fechaNacimiento);        
        return sb.toString();
    }
    
}
