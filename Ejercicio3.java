
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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una aplicación que a través de una función nos convierta 
        //una cantidad de euros introducida por teclado a otra moneda, 
        //estas pueden ser a dólares, yenes o libras. La función tendrá como 
        //parámetros, la cantidad de euros y la moneda a convertir que será una 
        //cadena, este no devolverá ningún valor y mostrará un mensaje 
        //indicando el cambio (void).
           Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("por favor ingrese la cantidad a convertir en euros");
        double euros = leer.nextDouble();
        System.out.println("Que moneda vas a cambiar? Dolares / yenes / libras");
       String divisas = leer.next();
       
       cambio(euros,divisas);
       
       
    }
    public static void cambio(double euros, String divisas){
        if (divisas.equalsIgnoreCase("Dolares")) {
            System.out.println("El cambio de " + euros + " euros a dolares es de : "+(euros*1.28611));
            
        }else if (divisas.equalsIgnoreCase("yenes")){
             System.out.println("El cambio de " + euros + " euros a yenes es de : "+(euros*129.852));
             
        }else if (divisas.equalsIgnoreCase("libras")){
            System.out.println("El cambio de " + euros + " euros a libra es de : "+(euros*0.86));
            
        }else {
            System.out.println("estas equivocado");
        }
    }
    
}
    
    

