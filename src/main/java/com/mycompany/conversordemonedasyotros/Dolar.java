package com.mycompany.conversordemonedasyotros;


public class Dolar extends Monedas{
   
    double valor = 800.26;           // 1 dolar = $800 chilenos
    String nombre = "DOLARES";

    
    public Dolar() {
        this.setValor(this.valor);
        this.setNombre(this.nombre);
    }

}
