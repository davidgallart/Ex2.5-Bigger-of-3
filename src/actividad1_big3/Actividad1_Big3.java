/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1_big3;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Actividad1_Big3 {

  
    public static void main(String[] args) {
int big;
                 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();
        
        System.out.println("Write a second number");
        int variable_2 = scanner.nextInt();
        
        
        System.out.println("Write the thrid number");
        int variable_3 = scanner.nextInt();
               
        
        if(variable_1 > variable_2 && variable_1 > variable_3){
            big= variable_1;
            
            System.out.println("The biggest number is: " + big);            
        }
        
        if(variable_2 > variable_1 && variable_2 > variable_3){
            big= variable_2;
          
            System.out.println("The biggest number is:" + big );        
            
        }
        
        if(variable_3 > variable_2 && variable_3 >  variable_2){
            big= variable_3;
            System.out.println("The biggest number is:" + big); 
    }
        
        /*
        Lo primero ha sido arreglar las condiciones de los if para que la primera variable sea la que se compare 
        si es mayor que las demas cambiando los == por > 
        y en la ultima variable poniendo dos veces la variable 3 en vez de la 1 que estaba puesta
        */
} 

}
