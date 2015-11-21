/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.producto;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;

/**
 *
 * @author david
 */
public class IngresarProductoRQ implements Cuerpo{
    
    private int codigo;
    private String nombre;
    private double costoUnitario;
    private String descripcion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "IngresarProductoRQ{" + "codigo=" + codigo + ", nombre=" + nombre + ", costoUnitario=" + costoUnitario + ", descripcion=" + descripcion + '}';
    }

    @Override
    public String asTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append("_").append(this.codigo);
        sb.append("-").append(this.nombre);
        sb.append("-").append(this.costoUnitario);
        sb.append("-").append(this.descripcion);
        return sb.toString();
    }
    
    
    
}
