
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Diseñe una función que pida el nombre y la edad de N personas e
        //imprima los datos de las personas ingresadas por teclado e indique si 
        //son mayores o menores de edad. Después de cada persona, el programa 
        //debe preguntarle al usuario si quiere seguir mostrando personas y frenar 
        //cuando el usuario ingrese la palabra “No”.
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        String respuesta2 = "SI";
        
        do{
            nombre = leer.next();
            edad = leer.nextInt();
            Usuario(nombre, edad);
          System.out.println("¿Desea continuar?");
          String respuesta = leer.next();
          respuesta2 = respuesta.toUpperCase();
        } while(respuesta2.equals("SI"));
    } 
    
    public static void Usuario(String nombre, int edad){
        
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    
    if (edad < 18){
        System.out.println("Es menor de edad");
       
    }else{
        System.out.println("Es mayor de edad");
    }
    
    
    
    
    
}
}
