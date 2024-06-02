package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.Algoritmos;

class TestsAlgoritmos {

	@Test
	void testFibonacci() {
	int FibonacciEspera = 3;
	int FibonacciObtiene = Algoritmos.fibonacci(5);
	assertEquals(FibonacciEspera, FibonacciObtiene);
	}

}
