package sec01;

public class MultiArrayExam {

	public static void main(String[] args) {

		int[][] score = {
				{80,96,95},
				{76,88}
		};
		System.out.println("���� score�� �迭�� ���̴�? : " + score.length);
		System.out.println("2���� �迭 ù ��° �迭�� ���̴�? :" + score[0].length);
		System.out.println("2���� �迭 ù ��° �迭�� ���̴�? :" + score[1].length);
		
		System.out.println("ù ��° ���� �� ��° �л� ������ : " + score[0][1]);
		System.out.println("�� ��° ���� ù ��° �л� ������ : " + score[1][0]);		
		
		int sum = 0;
		for(int i=0; i<score[0].length; i++) {
		sum += score[0][i];
		
		}		
		double class1 = (double) sum / score[0].length;
		System.out.println("ù��°�� ��� : " + class1);
		
		int sum2 = 0;
		for(int i=0; i<score[1].length; i++){
			sum2+=score[1][i];
			
		}
		double class2 = (double) sum2 / score[1].length;
		System.out.println("�ι�°�� ��� : " + class2);
		
		int student = 0;
		int total =0;
		for(int i=0; i<score.length; i++) {
			student += score[i].length;
			for(int k=0; k<score[i].length; k++) {
				total += score[i][k];
			}
		}
		double totalavg = (double) total / student;
		System.out.println("��ü �л��� �������" + totalavg);
		
	}

}
