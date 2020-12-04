package es.studium.Comparacadena;

import java.util.Scanner;

public class Comparacadena {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1,cadena2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Esribe la primera cadena");
		cadena1=teclado.nextLine();
		System.out.println("Escribe la segunda cadena");
		cadena2=teclado.nextLine();
		teclado.close();
		if (cadena1.length() == cadena2.length()){
			System.out.println("Las cadenas son iguales en longitud");
		}
			else if (cadena1.length()<cadena2.length()) {
			System.out.println("La cadena 2 es más larga ");
			}
			else {
					System.out.println("La cadena 1 es más larga ");
}
		}
}



