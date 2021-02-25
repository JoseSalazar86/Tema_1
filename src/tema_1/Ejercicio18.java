/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_1;
import java.util.*;
/**
 *
 * @author Jose Salazar
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un entero: ");
        int num1=sc.nextInt();

        System.out.println("Introduce un byte: ");
        byte num2=sc.nextByte();

        byte suma=(byte)(num1+num2);

        System.out.println(suma);
    }
    
}
