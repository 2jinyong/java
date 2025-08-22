package sec01;

public class MultiArrayExam {

	public static void main(String[] args) {

		int[][] score = {
				{80,96,95},
				{76,88}
		};
		System.out.println("변수 score의 배열의 길이는? : " + score.length);
		System.out.println("2차원 배열 첫 번째 배열의 길이는? :" + score[0].length);
		System.out.println("2차원 배열 첫 번째 배열의 길이는? :" + score[1].length);
		
		System.out.println("첫 번째 반의 두 번째 학생 점수는 : " + score[0][1]);
		System.out.println("두 번째 반의 첫 번째 학생 점수는 : " + score[1][0]);		
		
		int sum = 0;
		for(int i=0; i<score[0].length; i++) {
		sum += score[0][i];
		
		}		
		double class1 = (double) sum / score[0].length;
		System.out.println("첫번째반 평균 : " + class1);
		
		int sum2 = 0;
		for(int i=0; i<score[1].length; i++){
			sum2+=score[1][i];
			
		}
		double class2 = (double) sum2 / score[1].length;
		System.out.println("두번째반 평균 : " + class2);
		
		int student = 0;
		int total =0;
		for(int i=0; i<score.length; i++) {
			student += score[i].length;
			for(int k=0; k<score[i].length; k++) {
				total += score[i][k];
			}
		}
		double totalavg = (double) total / student;
		System.out.println("전체 학생의 평균점수" + totalavg);
		
	}

}
