/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code2flow;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Code2flow {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Welcome to code2flow");
      Scanner input = new Scanner(System.in);
       
       
      System.out.println("if In doubt type 'true' if not type 'false'");
      boolean indoubt = input.nextBoolean();
       if(indoubt==true){
           System.out.println("Press help");
           
           System.out.println("Are you ready?");
           boolean ready = input.nextBoolean();
           if (ready==false){
               System.out.println("Read help");
               if (ready==false){
                   System.out.println("My name is Chris");
               }
               
           }  
           else{
                   System.out.println("Improve your workFlow!");   
               }   
    }
        else{
            System.out.println("Improve your workFlow!");   
       }
    }
}
