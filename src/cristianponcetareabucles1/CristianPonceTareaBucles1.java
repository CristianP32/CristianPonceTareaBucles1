/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristianponcetareabucles1;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class CristianPonceTareaBucles1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4, sumimpar=0,sumpar=0;
        
        //Ingreso numeros por consola
        System.out.println("Ingrese nro1: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese nr2: ");
        num2 = leer.nextInt();
        System.out.println("Ingrese nro3: ");
        num3 = leer.nextInt();
        System.out.println("Ingrese nro4: ");
        num4 = leer.nextInt();
        
        //Defino par e impar
     if(num1 %2 == 0){
         System.out.println( num1 + " es par ");
     } else {
            System.out.println(num1 + " es impar ");
     }
     if(num2 %2 == 0){
         System.out.println(num2 + " es par ");
     } else {
            System.out.println(num2 + " es impar ");
     }
     if(num3 %2 == 0){
         System.out.println(num3 + " es par ");
     } else {
            System.out.println(num3 + " es impar ");
     }
     if(num4 %2 == 0){
         System.out.println(num4 + " es par ");
     } else {
            System.out.println(num4 + " es impar ");
     }
     //Realizo operación (me quedó mal)
     
     for (int i=0;i<=4;i++){
         if(i%2 == 0){
         sumimpar = i + sumimpar;
         }
         else sumpar= i+sumpar;
     }
        System.out.println("La suma de pares es:" + (sumpar));
        System.out.println("La suma de impares es " + (sumimpar)); 
     
    }
        
        
    }
    

