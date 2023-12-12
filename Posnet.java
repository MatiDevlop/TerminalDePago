/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terminaldepagos;

/**
 *
 * @author CltControl
 */
public class Posnet {
    public static final double RECARGO_POR_CUOTA=0.03;
    public static final int MIN_CANT_CUOTAS=1;
    public static final int MAX_CANT_CUOTAS=6;
    
    public Ticket efectuarPago(TarjetaDeCredito t,double m,int c){
        Ticket ticket=null;
        if(datosValidos(t,m,c)){
            double montoFinal=m+(m*recargoSegunCuotas(c));
            if(t.tieneSaldoDisponible(m)){
                t.descontar(montoFinal);
                return new Ticket(t.nombreCompletoDeTitular(),montoFinal,montoFinal/c);
            }
        }
        return ticket;
    }
    private boolean datosValidos(TarjetaDeCredito t,double m,int c){
        return t!=null && m>0 && (c>=MIN_CANT_CUOTAS && c<=MAX_CANT_CUOTAS);
    }
    private double recargoSegunCuotas(int cuotas){
        return (cuotas-1)*RECARGO_POR_CUOTA;
    }
}
