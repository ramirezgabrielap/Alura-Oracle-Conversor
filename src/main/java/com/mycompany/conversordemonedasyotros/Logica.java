package com.mycompany.conversordemonedasyotros;

import com.mycompany.conversordemonedasyotros.temp.Temperaturas;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Logica {
    
    public Logica() {
    }
    
    //Saludo
    public void welcome() {
        JOptionPane.showMessageDialog(null, "Bienvenido al Conversor de Monedas y Otros");
        JOptionPane.showMessageDialog(null, "Acá podrás encontrar calculos de Monedas y temperatura.");
    }
    
    
    // Menú, se captura la opción ingresada por el usuario
    public void opciones(){
        String opcion = (JOptionPane.showInputDialog(null, "Escoja la opción de Conversor a utilizar: ", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
                new Object[]{"MONEDAS", "TEMPERATURA", "SALIR"}, "Seleccion")).toString();
        
        switch (opcion){
            case "MONEDAS":
                opcion1();
                break;
            case "TEMPERATURA":
                opcion2();
                break;
            case "SALIR":
                despedida();
        }
    }
    
    
    // Lógica de la opción 1 del menú principal (MONEDAS)
    public void opcion1(){
        String tipo = (JOptionPane.showInputDialog(null, "¿Qué moneda desea utilizar?: ", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
                new Object[]{"DOLAR", "EURO", "LIBRA", "YEN JAPONÉS"}, "Seleccion")).toString();
    
        String opc = (JOptionPane.showInputDialog(null, "¿Desea convertir DESDE PESOS CHILENOS o HACIA PESOS CHILENOS?", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
                new Object[]{"DESDE PESOS CHILENOS", "HACIA PESOS CHILENOS"}, "Seleccion")).toString();
     
        switch (tipo){
            case "DOLAR":
                Dolar dolar = new Dolar();
                if(opc == "DESDE PESOS CHILENOS"){
                    dolar.aOtraMoneda();
                } else {
                    dolar.aPesos();
                }
                volver();
                break;
            case "EURO": // EURO
                Euro euro = new Euro();
                if(opc == "DESDE PESOS CHILENOS"){
                    euro.aOtraMoneda();
                } else{
                    euro.aPesos();
                } 
                volver();
                break;
            case "LIBRA": // LIBRA
                LibraEsterlina libra = new LibraEsterlina();
                if(opc == "DESDE PESOS CHILENOS"){
                    libra.aOtraMoneda();
                } else {
                    libra.aPesos();
                }
                volver();
                break;
            case "YEN JAPONÉS": // YEN JAPONÉS
                YenJapones yen = new YenJapones();
                if (opc == "DESDE PESOS CHILENOS"){
                    yen.aOtraMoneda();
                } else {
                    yen.aPesos();
                }       
                volver();
                break;
        
        }
    }
    
 
    
    // Lógica de la opción 2 del menú principal
    public void opcion2(){
        Temperaturas temp = new Temperaturas();
        String opc = (JOptionPane.showInputDialog(null, "Escoja la opción de Conversor a utilizar: ", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
                new Object[]{"DESDE CELSIUS A FAHRENHEIT", "DESDE FAHRENHEIT A CELSIUS"}, "Seleccion")).toString();
        
        if(opc == "DESDE CELSIUS A FAHRENHEIT"){
            temp.aFahren();
        } else {
            temp.aCelsius();
        }      
        volver();
    }
    
   
    
    // Menú que se muestra al finalizar cada consulta, para saber si el usuario desea terminar o volver a consultar
    public void volver(){
        Scanner sc = new Scanner(System.in);
    
        String resp = (JOptionPane.showInputDialog(null, "¿Desea volver al menú principal para realizar más conversiones?", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
                new Object[]{"VOLVERL AL MENÚ PRINCIPAL", "SALIR"}, "Seleccion")).toString();

        if (resp == "VOLVERL AL MENÚ PRINCIPAL"){
            opciones();
        } else {
            despedida();
        }
    }
    
    
    // Despedida que se despliega en caso de que el usuario no quiera seguir utilizando la aplicación
    public void despedida() {
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro Conversor. Hasta pronto");
        System.exit(0);

    } 
 
}
