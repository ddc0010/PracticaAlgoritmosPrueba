package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.Algoritmos;

class TestsAlgoritmos {

	@Test
	void testFactorial() {
		int FactorialEspera = 120; 
		int FactorialObtiene = Algoritmos.factorial(5);
		assertEquals(FactorialEspera, FactorialObtiene);
	}
	
	@Test
	void testFibonacci() {
		int fibonacciEspera = 5;
		int fibonacciObtiene = Algoritmos.fibonacci(5);
		assertEquals(fibonacciEspera, fibonacciObtiene);
	}
	
	@Test
	void testesPrimo() {
		int numero = 7;
		boolean PrimoEspera = false; 
		boolean PrimoObtiene = Algoritmos.esPrimo(numero);
		assertEquals(PrimoEspera, PrimoObtiene);
	}

}
