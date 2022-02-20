package week1.day2.assignment4;

public class FindIntersection {
	public static void main(String[] args) {
		 int[] arrFir = {3,2,11,4,6,7};
		 int[] arrSec= {1,2,8,4,9,7};
		 int[] temparr=new int[arrFir.length];
		 int temp =0;
		 for (int i=0; i<arrFir.length;i++) {
			 
			 for(int j=0;j<arrSec.length;j++) {
				 if(arrSec[j]==arrFir[i]) {
					 
					 System.out.println(arrFir[i]);
					 temparr[temp] = arrFir[i];
					 temp++;
					 break;
				 }
			 }
			 
		 }
		 for(int tempi=0;tempi<temparr.length;tempi++) {
			 if (temparr[tempi]>0) {
		 System.out.print(temparr[tempi]+" ");
			 }
		 }
	}

}
