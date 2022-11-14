package javabasico;

import java.util.Scanner;

public class Actividad2 {
	/*Hacer un programa, donde se definirán tres variables locales nombre, apellidos y
	edad, siendo esta última de tipo entero. Estas variables se introducirán por consola.
	Finalmente mostrará un mensaje en consola usando las variables de la siguiente forma: “Hola
	nombre apellidos tienes edad años*/
	
	public static void main(String[] args) {
		//1. Define the vars that are introduced in the console.
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		int edad;
		
		System.out.println("Nombre(s)");
		nombre = teclado.nextLine();	
		
		System.out.println("Apellido(s)");
		apellidos = teclado.nextLine();
		
		System.out.println("Edad");
		edad = teclado.nextInt();
		
		//2. Show the message in console using the variables in the next form: "Hola name + apellidos tienes + edad + años.
		
		System.out.println("Hola " + nombre + " " + apellidos + " tienes " + edad + " años");

	}

}
