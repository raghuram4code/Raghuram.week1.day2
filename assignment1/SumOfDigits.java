package week1.day2.assignment1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

//Why the number starting with 0 is not giving right output

public class SumOfDigits {
	public int sendremainder(int a) {
		int rem = a%10;		
		return rem;
	}
	
	public static void main(String[] args) {

		int givenNumber = 555;
		int whileNumber=givenNumber;
		int sum= 0;
		int sumWhile=0;
		SumOfDigits objSumOfDigits= new SumOfDigits();
		for (int i=0; givenNumber>=1;i++) {
			//System.out.println(objSumOfDigits.sendremainder(givenNumber));
			sum= sum + objSumOfDigits.sendremainder(givenNumber);
			//System.out.println(sum);
			givenNumber= givenNumber/10;
			//System.out.println(givenNumber);
		}
		System.out.println( "ouput using for loop " +sum);
	
	
	while(whileNumber>0) {
		int rem = whileNumber%10;
		//System.out.println(rem);
		sumWhile =sumWhile+rem;
		//System.out.println(sumWhile);
		whileNumber=whileNumber/10;	
	//	System.out.println(whileNumber);
	}
	System.out.println("ouput using while loop " +sumWhile);
}
}
