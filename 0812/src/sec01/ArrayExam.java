package sec01;

public class ArrayExam {

	public static void main(String[] args) {
		
		int[] score = {70,80,77,95};
		
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum+= score[i];
			
		}
		System.out.println("รัวี : " + sum);
		double avg = (double)sum / score.length;
		
		System.out.println(avg);
	}

}
