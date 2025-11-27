package proyecto_prueba;

import java.util.Scanner;

public class Prueba_Arrays {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		int numeros_almacenados[] = {8, 33, 200, 110, 11};
		System.out.println("Tenemos el número: " + numeros_almacenados[2]);
		
		String palabras[] = {"HOLA", "esto", "-ES-", "texto"};
		System.out.println("Tenemos la palabra: " + palabras[2]);
		*/
		
		int valores[] = new int[5];
		//System.out.println("Tenemos el número: " + valores[3]);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce tu nota: ");
			int numero_leido = entrada.nextInt();
			
			valores[i] = numero_leido;
			
		}
		
		// muestro los valores
		
		for (int j = 0; j <= 5; j++) {
			System.out.println("elementi v[" + j + "] = " + valores[j]);
		}
		
		
	}

}
