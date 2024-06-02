package Util;

public abstract class Algoritmos {
	
	public static int factorial (int num) {
		if (num == 0)
			return 1; 
		else 
			return num * factorial(num - 1);
	}
	
	public static int fibonacci(int num) {
		if (num <= 1)
			return num; 
		else
			return fibonacci(num-1) + fibonacci(num -2);
	}

}
