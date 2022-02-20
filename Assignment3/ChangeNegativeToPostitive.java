package week1.day2.Assignment3;

public class ChangeNegativeToPostitive {

	public static void main(String[] args) {
		int givenNumber = 0;

		if (givenNumber <0) {
			int changedNumber = -40*-1;
			System.out.println("The number "+givenNumber +" is converted to "+changedNumber );
		}
		else if (givenNumber ==0)
			System.out.println("The number is 0");
		else
			System.out.println("The number "+givenNumber + " is already positive number");

	}

}
