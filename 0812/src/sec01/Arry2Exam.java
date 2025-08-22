package sec01;

public class Arry2Exam {

	public static void main(String[] args) {

		int[] score;
		
		score = new int[] { 83, 90, 50};
		for(int num : score) {
			System.out.println(num);
		}

		printitem(new int[] {12,30,11,4});
		printitem(score);
	}
	
	public static void printitem(int[] sc) {
		for(int num : sc) {
			System.out.println(num);
		}
		
		int[] intArr = new int[3];
		intArr[0] =10;
		intArr[1] =12;
		intArr[2] =22;
		//intArr[3] =30;
		
		for(int num : intArr) {
			System.out.println(num);
		}
	}

	
	
}

