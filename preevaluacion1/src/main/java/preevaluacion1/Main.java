/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preevaluacion1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingresar nota 1");
        Scanner input = new Scanner (System.in);
        float nota1 = input.nextFloat();
        System.out.println("nota1 = "+ nota1);
        
        System.out.println("ingresar nota 2");
        float nota2 = input.nextFloat();
        System.out.println("nota2 = "+ nota2);
        
        System.out.println("ingresar nota3");
        float nota3 = input.nextFloat();
        System.out.println("nota3 = "+ nota3);
        
        float promedio = (nota1 + nota2 + nota3)/3;
        System.out.println("promedio = "+ promedio);
        
       if (promedio >= 5.5){
           System.out.println("Aprobo sin examen");
       }else{
           System.out.println("se va examen");
        
           float examen = (float) ((4-(promedio*0.7))/0.3);
           System.out.println("la nota del examen para que apruebe es " +examen);
           if (examen < 7){
               System.out.println("se tiene que sacar "+ examen + " para aprobar");
              
           }else{
               System.out.println("el estudiante reprobo");
           }
           
       }
        
    } 
  
   
}