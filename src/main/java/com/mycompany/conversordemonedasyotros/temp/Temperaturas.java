package com.mycompany.conversordemonedasyotros.temp;

import javax.swing.JOptionPane;

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
        try {
            String valor = JOptionPane.showInputDialog("Ingrese los grados a calcular: ", cantidad);
            double cantidad = Double.parseDouble(valor);
            double resultado = Math.round(((cantidad * 9/5) + fahrenheit) * 100.00) / 100.00;
            JOptionPane.showMessageDialog(null, "SON: " + resultado + " GRADOS FAHRENHEIT");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese SOLO números");
            aFahren();
        }
    }

    
    public void aCelsius(){
        try {
            String valor = JOptionPane.showInputDialog("Ingrese los grados a calcular: ", cantidad);
            double cantidad = Double.parseDouble(valor);
            double resultado = Math.round(((cantidad - fahrenheit) * 5/9)* 100.000) / 100.00;
            JOptionPane.showMessageDialog(null, "SON: " + resultado + " GRADOS CELSIUS");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese SOLO números");
            aCelsius();
        }
    }
    
}
