package week1.day2.assignment1;

/*how to print all digits in array at once
how to do this in array*/

public class FibonacciSeries {
	
	/*
	 * private void fibo(int a) { int temp = 0; for ( int i =1 ; i < a; i ++) { temp
	 * = temp +i; System.out.println(temp); }
	 * 
	 * System.out.println(a);
	 * 
	 * }
	 */
	public static void main(String[] args) {

		int range = 8;
		int presentNum=1;
		int previousNum=0;
		
		System.out.print("output with out array " + previousNum + " ");
		System.out.print(presentNum);
			for (int i=2;i<range;i++) {
			int sum = previousNum + presentNum;
			previousNum=presentNum;
			presentNum= sum;
			System.out.print(" " +sum );
		}
			
			System.out.println();
			
			int [] fib  = new int[range];
			fib[0]=0;
			fib[1]=1;
			System.out.print("output with array "+ fib[0]+ " ");
			System.out.print(fib[1]);
			
				for (int i=1;i<range-1;i++) {
				fib[i+1] = fib [i]+fib[i-1];
				System.out.print(" "+fib[i+1]);
			}
		
		//FibonacciSeries objectFibo = new FibonacciSeries();
		
	//	objectFibo.fibo(range);
				
	}

}
