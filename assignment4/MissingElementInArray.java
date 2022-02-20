package week1.day2.assignment4;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int [] arr = {5,7,1,2,3,4};
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++) {
			int check = i+1;
			if(arr[i] != check) {
				//print output
				System.out.println("Missing number is " + check);
				break;
				}
			
		}	
		
	}

}

		/*
		 * int [] arr = {5,7,1,2,3,4}; //sort Array Arrays.sort(arr); //initiate loop
		 * int noOfMissingNumbers = arr[arr.length-1]-arr.length;
		 * System.out.println(arr[arr.length-1]);
		 * System.out.println(noOfMissingNumbers); if (noOfMissingNumbers ==0) {
		 * System.out.println("No Numbers missing"); } else if(noOfMissingNumbers<0){
		 * System.out.println("Duplicate numbers exist"); } else { for (int i =0;
		 * i<arr.length;i++) { //check index value and value in arry
		 * System.out.println(i +"," +arr[i]); //assign value to be verified to temp
		 * variable int check = i+1; //check temp value System.out.println(check);
		 * //check if condition is meeting if(noOfMissingNumbers>0 && arr[i] != check) {
		 * //print output System.out.println("Missing number is " + check);
		 * noOfMissingNumbers--;
		 * 
		 * 
		 * } } }
		 * 
		 */		/*
		 * int [] arr2 = {1,2,3,4,7,6,8,9}; //for multiple missing values for (int j
		 * =0;j<arr2.length;j++) { if(arr2[j]== j+1) {
		 * System.out.println("Missing number is " + j+1); break; } }
		 */

