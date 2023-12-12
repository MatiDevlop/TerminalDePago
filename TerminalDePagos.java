/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.terminaldepagos;

/**
 *
 * @author CltControl
 */
public class TerminalDePagos {

    public static void main(String[] args) {
        Posnet pos=new Posnet();
        Persona p=new Persona("123456789","Luis","Archivaldo","987654321","koir@espol.edu.ec");
        TarjetaDeCredito t=new TarjetaDeCredito("FakeBank","789456123",15000,p,EntidadFinanciera.CASTERMARD);
        System.out.println("Tarjeta antes del pago");
        System.out.println(t);
        
        System.out.println("Ticket tras pagar");
        Ticket ticket=pos.efectuarPago(t, 10000, 5);
        System.out.println(ticket);
        
        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
    }
}
