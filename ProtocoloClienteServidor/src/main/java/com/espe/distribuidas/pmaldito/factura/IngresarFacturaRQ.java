/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.pmaldito.factura;

import com.espe.distribuidas.pmaldito.pcs.Cuerpo;

/**
 *
 * @author david
 */
public class IngresarFacturaRQ implements Cuerpo{
    
    private String codigoCLiente;
    private int codigoFactura;
    private String fechaEmision;
    private double totalFactura;
    private String cuerpo;

    public IngresarFacturaRQ(int codigoFactura, String codigoCLiente, String fechaEmision, double totalFactura, String cuerpo) {
        this.codigoFactura = codigoFactura;
        this.codigoCLiente = codigoCLiente;
        this.fechaEmision = fechaEmision;
        this.totalFactura = totalFactura;
        this.cuerpo = cuerpo;
    }
    
    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getCodigoCLiente() {
        return codigoCLiente;
    }

    public void setCodigoCLiente(String codigoCLiente) {
        this.codigoCLiente = codigoCLiente;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    @Override
    public String asTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append("_").append(this.codigoCLiente);
        sb.append("-").append(this.codigoFactura);
        sb.append("-").append(this.fechaEmision);
        sb.append("-").append(this.totalFactura);
        sb.append("_").append(this.cuerpo);        
        return sb.toString();
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
}
