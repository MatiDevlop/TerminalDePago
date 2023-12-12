/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terminaldepagos;

/**
 *
 * @author CltControl
 */
public class TarjetaDeCredito {
    private String entidadBancaria;
    private String numero;
    private double saldo;
    private Persona persona;
    private EntidadFinanciera entidad;

    public TarjetaDeCredito(String entidadBancaria, String numero, double saldo, Persona persona, EntidadFinanciera entidad) {
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.persona = persona;
        this.entidad = entidad;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo + ", persona=" + persona + ", entidad=" + entidad + '}';
    }
    
    public boolean tieneSaldoDisponible(double monto){
       return saldo>=monto; 
    }
    public void descontar(double m){
        saldo-=m;
    }
    public String nombreCompletoDeTitular(){
        return this.persona.nombreCompleto();
    }
}
