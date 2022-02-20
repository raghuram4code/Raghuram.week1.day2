package week1.day2.assignment1;

public class PrimeNum {

	public static void main(String[] args) {
	
		int givenNum = 14;
		//int tocheckloop =0;
		
		boolean isPrime = false;
		
		for (int i=2; i<=givenNum/2;i++) {
			if (givenNum%i==0) {
				isPrime=true;
				break;
			}
			
			//tocheckloop++;
		}
		
		//System.out.println(tocheckloop);
		
		if(isPrime) {
			System.out.println("Given Number is prime");
		}
		else {
			System.out.println("Given Number is not prime");
		}

	}

}
