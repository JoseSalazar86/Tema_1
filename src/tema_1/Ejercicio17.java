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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc=new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cad1=sc.nextLine();

        int cadUno= Integer.parseInt(cad1);

        System.out.println("Introduce otra cadena: ");
        String cad2=sc.nextLine();

        double cadDos= Double.parseDouble(cad2);


        double suma=(int)cadUno+cadDos;

        String sum=String.valueOf(suma);

        System.out.println(0+sum);
    }
    
}
