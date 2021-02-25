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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
	
	System.out.println("Introduce un numero entero");
	int numero =sc.nextInt();
	System.out.println("Introduce un numero decimal");
	double decimal =sc.nextDouble();
	System.out.println("Introduce una letra");
	char caracter =sc.next().charAt(0);
	
	System.out.println(numero);
	System.out.println(decimal);
	System.out.println(caracter);
    }
    
}
