package javabasico;

import java.util.Scanner;

public class Actividad2 {
	/*Hacer un programa, donde se definirán tres variables locales nombre, apellidos y
	edad, siendo esta última de tipo entero. Estas variables se introducirán por consola.
	Finalmente mostrará un mensaje en consola usando las variables de la siguiente forma: “Hola
	nombre apellidos tienes edad años*/
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nombre;
		int apellido;
		int edad;
		
		System.out.println("Nombre(s)");
		nombre = teclado.nextInt();
		
		System.out.println("Apellido(s)");
		apellido = teclado.nextInt();
		
		System.out.println("Edad");
		edad = teclado.nextInt();

	}

}
