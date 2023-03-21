package com.mycompany.conversordemonedasyotros.temp;

import java.util.Scanner;


public class Temperaturas {
    

    double fahrenheit = 32;
    double cantidad;

    
    public Temperaturas() {
    }

    
    public double getFahrenheit() {
        return fahrenheit;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

      
    
    public void aFahren(){
        Scanner scr = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Ingrese los GRADOS a calcular:");
        System.out.print("°: ");
        cantidad = scr.nextDouble();
        double resultado = Math.round(((cantidad * 9/5) + fahrenheit) * 100.00) / 100.00;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("SON: " + resultado + " GRADOS FAHRENHEIT");
    }

    
    public void aCelsius(){
        Scanner scr = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Ingrese los GRADOS a calcular:");
        System.out.print("°: ");
        cantidad = scr.nextDouble();
        double resultado = Math.round(((cantidad - fahrenheit) * 5/9)* 100.000) / 100.00;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("SON: " + resultado + " GRADOS CELSIUS");
    }
}
