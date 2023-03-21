package com.mycompany.conversordemonedasyotros;

import java.util.Scanner;


public class Monedas {
    
    double valor;
    double cantidad;
    String nombre;

    
    
    public Monedas() {
    }

    
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    
    public void aOtraMoneda(){
        Scanner scr = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("INGRESE la cantidad de pesos chilenos a calcular:");
        System.out.print("$: ");
        this.cantidad = scr.nextDouble();
        double resultado = Math.round(((this.cantidad / this.getValor())) * 100.00) / 100.00;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("TIENES: " + resultado + " " + this.getNombre());
    }
   //Math.round(((cantidad - fahrenheit) * 5/9)* 100.000) / 100.00;
    
    public double aPesos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("INGRESE la cantidad en " + this.getNombre() + " a calcular:");
        System.out.print("$: ");
        this.cantidad = sc.nextDouble();
        double resultado = Math.round(((this.cantidad * this.getValor())) * 100.00) / 100.00;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("TIENES: " + resultado + " PESOS CHILENOS");
        return resultado;
    }
}
