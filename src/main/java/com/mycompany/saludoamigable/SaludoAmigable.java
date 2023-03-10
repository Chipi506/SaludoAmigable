package com.mycompany.saludoamigable;
import java.util.Scanner;

public class SaludoAmigable {
        Scanner entrada = new Scanner(System.in);
        static String nombre ="";
        
    public void Saludo(String nombre){
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }
    public static void main(String[] args) {
        
        SaludoAmigable saludoA = new SaludoAmigable();
        saludoA.Saludo(nombre);
        

    }

}
