package week1.day2.assignment2;

public class Mycalculator {

	public static void main(String[] args) {
		int num1 = 10, num2=15, num3 = 20;
		Calculator objCalc = new Calculator();
		int sum = objCalc.add(num1, num2, num3);
		int diff = objCalc.sub(num1, num2);
		double mul = objCalc.mul(num1, num2);
		float divd= objCalc.div(num1, num2);
		
		System.out.println("The sum of three numbers is : " + sum);
		System.out.println("Difference of first two numbers is : " + diff);
		System.out.println("Multiply of first two numbers is : " + mul);
		System.out.println("Division of first numbers is : " + divd);
	}

}
