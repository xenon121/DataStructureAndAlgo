package algorithems.simple;

public class FibonacciNumber {

	public static int printFibonacci(int n, int a, int b, int c) {
		
		if(n <= 0) return 0;
		
		System.out.print(a+",");
		
		a = b;
		b = c;
		c = a + b;
		
		printFibonacci(n-1, a, b, c);
		
		return n;
	}
	
	public static int fibonacci(int n) {
		
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args) {
		
		int n = 10, a = 0,b = 1,c = 1;
		
		System.out.println("- using loop -");
		for(int i=0; i<n; i++) {
			
			System.out.print(a+",");
			
			a = b;
			b = c;
			c = a + b;
		}
		
		n = 10; 
		a = 0;
		b = 1;
		c = 1;
		
		System.out.println("\n- using recursion -");
		printFibonacci(n, a, b, c);
		
		n = 10;
		
		System.out.println("\n- nth fibonacci number using recursion 2 -");
		System.out.println(fibonacci(n-1));
		
	}

}
