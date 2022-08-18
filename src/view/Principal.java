//feito em conjunto com outra aluna 
package view;

import controller.RecurString;

 public class Principal {

 public static void main( String[] args){
	
 invertiString inverti = new invertiString ();
 
 String N = "Invertir";
 
 int resultado = inverti.invertiString(N, N.length());

 System.out.println(resultado);
   }
}