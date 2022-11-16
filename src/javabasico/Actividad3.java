package javabasico;

import java.util.Scanner;

public class Actividad3 {
	/*Haz una aplicación que calcule el área de un círculo(pi*R^2). El radio se pedirá por
	teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el
	método pow de Math.*/


	public static void main(String[] args) {
		// 1. Pedir radio por teclado
		Scanner keyboard = new Scanner(System.in);
		// 2. Dar nombre a nuestra variable del teclado y definir tipo
		int radio;
		System.out.println("Hola. Bienvenidx, introduce un número, por favor: ");
		radio = keyboard.nextInt();
		// 3. Mensaje gracias
		System.out.println("Gracias. Este será el radio en cm.");
		// Pasar de String a double con Double.parseDouble
		//sc.useLocale(Locale.US);
		//double radio1 = sc.nextDouble();
		// 4. Multiplicar R2 * pi
		double area = Math.PI*Math.pow(radio,2);
		// imprime el resultado
		System.out.println("El resultado del área de un círculo con el radio anterior, es de: " + area + "cm2");
	}

}
