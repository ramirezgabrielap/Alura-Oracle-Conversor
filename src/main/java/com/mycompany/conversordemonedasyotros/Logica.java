package com.mycompany.conversordemonedasyotros;

import com.mycompany.conversordemonedasyotros.temp.Temperaturas;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Logica {
    
    public Logica() {
    }
    
    //Saludo
    public void welcome() {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al Conversor de Monedas y Otros");
        System.out.println("Acá podrás encontrar calculos de Monedas y otras mediciones como distancia, peso y temperatura.");
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
    
    
    // Menú donde se encuentran las principales opciones de la aplicación
    public void menuPrincipal() {
        System.out.println("Escoja la opción de Conversor a utilizar: ");
        System.out.println("1.- MONEDAS");
        System.out.println("2.- TEMPERATURA");
        System.out.println("3.- SALIR"); 
    }
    
    
    // Acá se captura la opción ingresada por el usuario
    public void opciones(){
        int opcion = 0;
        do {    
            try {
                Scanner scr = new Scanner(System.in);
                System.out.print("OPCION: ");
                opcion = scr.nextInt(); 
            }catch (Exception err){
                System.out.println("INGRESE UNA OPCION ENTRE EL 1 Y EL 3!");
                opcion=0;
            }       
        } while (opcion != 1 && opcion != 2 && opcion != 3); 

        switch (opcion){
            case 1: // MONEDAS
                opcion1();
                break;
            case 2: // TEMPERATURA
                opcion2();
                break;
            case 3: // SALIR
                despedida();
        }
    }
    
    
    // Lógica de la opción 1 del menú principal (MONEDAS)
    public void opcion1(){
        System.out.println("---------------------------------");
        System.out.println("¿Qué moneda desea utilizar?: ");
        System.out.println("1.- DOLAR");
        System.out.println("2.- EURO");
        System.out.println("3.- LIBRA");   
        System.out.println("4.- YEN JAPONÉS"); 

        moneda();
    }
    
    
    // Lógica del menú de tipos de monedas
    public void moneda(){
        int tipo = 0;
        int opc;
        
        do {    
            try {
                Scanner scr = new Scanner(System.in);
                System.out.print("OPCION: ");
                tipo = scr.nextInt(); 
            }catch (Exception err){
                System.out.println("INGRESE UNA OPCION ENTRE EL 1 Y EL 4!");
                tipo=0;
            }       
        } while (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4); 

        do { 
            try {
                Scanner sca = new Scanner(System.in);
                System.out.println("---------------------------------------------------");
                System.out.println("Indique 1 para convertir DESDE PESOS CHILENOS.");
                System.out.println("Indique 2 para convertir HACIA PESOS CHILENOS.");
                System.out.print("OPCION: ");
                opc = sca.nextInt();
            }catch (Exception err){
                System.out.println("INGRESE UNA OPCION ENTRE EL 1 Y EL 2!");
                opc=0;
            } 
        } while (opc != 1 && opc != 2);   
        
        switch (tipo){
            case 1: // DOLAR
                Dolar dolar = new Dolar();
                if(opc == 1){
                    dolar.aOtraMoneda();
                } else {
                    dolar.aPesos();
                }
                volver();
                break;
            case 2: // EURO
                Euro euro = new Euro();
                if(opc == 1){
                    euro.aOtraMoneda();
                } else{
                    euro.aPesos();
                } 
                volver();
                break;
            case 3: // LIBRA
                LibraEsterlina libra = new LibraEsterlina();
                if(opc == 1){
                    libra.aOtraMoneda();
                } else {
                    libra.aPesos();
                }
                volver();
                break;
            case 4: // YEN JAPONÉS
                YenJapones yen = new YenJapones();
                if (opc == 1){
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
        int opc;
        
        do { 
            try {
                Scanner sca = new Scanner(System.in);
                System.out.println("---------------------------------------------------");
                System.out.println("Indique 1 para convertir DESDE GRADOS CELSIUS A FAHRENHEIT.");
                System.out.println("Indique 2 para convertir DESDE GRADOS FAHRENHEIT A CELSIUS.");
                System.out.print("OPCION: ");
                opc = sca.nextInt();
            }catch (Exception err){
                System.out.println("INGRESE UNA OPCION ENTRE EL 1 Y EL 2!");
                opc=0;
            } 
        } while (opc != 1 && opc != 2);   
        
        if(opc == 1){
            temp.aFahren();
        } else {
            temp.aCelsius();
        }      
        volver();
    }
    
   
    
    // Menú que se muestra al finalizar cada consulta, para saber si el usuario desea terminar o volver a consultar
    public void volver(){
    Scanner sc = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("¿Desea volver al menú principal para realizar más conversiones?");
            System.out.println("Indique: 1 = SI, 2 = SALIR");
            System.out.print("OPCION: ");
            int resp = sc.nextInt();
            if (resp == 2){
                despedida();
            }
            if (resp == 1){
                menuPrincipal();
                opciones();
            }
            if (resp <1 || resp >2) {
                System.out.println("Ingrese una opción VALIDA entre 1 y 2 !");
                volver();
            }
        }catch (InputMismatchException err){
            System.out.println("Ingrese una opción VALIDA entre 1 y 2");
            int resp = 0;
            volver();
        }
    }
    
    
    // Despedida que se despliega en caso de que el usuario no quiera seguir utilizando la aplicación
    public void despedida() {
        System.out.println("-----------------------------------------");
        System.out.println("Gracias por utilizar nuestro Conversor");
        System.out.println("Hasta pronto");
        System.exit(0);

    } 
 
}
