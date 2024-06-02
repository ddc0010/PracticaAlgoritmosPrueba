package app;

import java.util.Random;

import Util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		int [] numeros = new int[5];
		Random random = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(10)+1;
			
			//Calcula mediante un bucle el numero de fibonaccio de los 5 numeros de los arrays
			int [] resultadoFibonacci = new int[5];
			int[]resultadoFactorial = new int[5]; 
			boolean[]resultadoPrimos = new boolean[5];
			
			resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
			resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
			resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
		}

	}

}
