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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce una cadena de texto");
		String cadena=sc.nextLine();
		     
	System.out.println(cadena.substring(cadena.length()/2, cadena.length()));

    }
    
}
