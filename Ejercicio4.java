
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una aplicación que nos pida un número por teclado 
        //y con una función se lo pasamos por parámetro para que nos indique si 
        //es o no un número primo, debe devolver true si es primo, sino false.

        //Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
        //Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
        //sin embargo, 17 si es primo.
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int num = leer.nextInt();
        
        primo(num);
       
        if (primo(num) >= 2){
            System.out.println(num + " no es un numero primo");
        }else{
            System.out.println(num + " es un numero primo");
            
        }

    }
    
    public static int primo(int num){
        
        int resul = 0;
        
        if (num % num == 0){
            resul += 1;
        }
        
        if (num != 2 && num % 2 == 0){
                resul += 1;
        }
        
        if (num != 3 && num % 3 == 0){
                resul += 1;
        }
        
        return resul;
    }
}
