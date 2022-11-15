package javabasico;

public class Actividad1 {
	/*Crea un programa donde definamos las siguientes variables y las convirtamos a
	los distintos tipos indicados, mostrando el resultado de la conversión por consola.
	int a = 65; → long y char
	long b = 10 → double y int
	char c = ‘A’ → int
	double d = 1.8 → float y int*/
	public static void main(String[] args) {
		//1. Convertir variables
		int a = 65;
		char a2 = (char)a;
		long a3 = Long.valueOf(a);
		
		long b = 10;
		int b2 = (int)b;
		double b3 = b;
		
		char c = 'A';
		int c2 = c;
		
		double d = 1.8;
		int d2 = (int)d;
		
		
		String d3 = String.valueOf(d);
		
		float i = Float.parseFloat(d3);
		
		//2. Mostrar el resultado por consola
		System.out.println("Resultado de las conversiones:");
		System.out.println("a = " + a2 + " y " + a3);
		System.out.println("b = " + b2 + " y " + b3);
		System.out.println("c = " + c2);
		System.out.println("d = " + d2 + " y " + d3);
	}

}
