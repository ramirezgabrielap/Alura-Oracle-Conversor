package com.mycompany.conversordemonedasyotros;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        try {
            String valor = JOptionPane.showInputDialog("Ingrese la cantidad de PESOS CHILENOS a calcular: ", cantidad);
            double cantidad = Double.parseDouble(valor);
            double resultado = Math.round(((cantidad / this.getValor())) * 100.00) / 100.00;
            JOptionPane.showMessageDialog(null, "TIENES: " + resultado + " " + this.getNombre());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese SOLO números");
            aOtraMoneda();
        }
    }

    
    public void aPesos(){
        try {
            String valor = JOptionPane.showInputDialog("Ingrese la cantidad en " + this.getNombre() + " a calcular: ", cantidad);
            double cantidad = Double.parseDouble(valor);
            double resultado = Math.round(((this.cantidad * this.getValor())) * 100.00) / 100.00;
            JOptionPane.showMessageDialog(null, "TIENES: " + resultado + " PESOS CHILENOS");
        } catch (NumberFormatException ex) {    
            JOptionPane.showMessageDialog(null, "Ingrese SOLO números");
            aPesos();
        }
    }
}
