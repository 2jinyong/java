package sec01;

public class CompareOpExam {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		boolean rs1 = (num1 == num2);
		boolean rs2 = (num1 != num2);
		boolean rs3 = (num1 <= num2);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean rs4 = (char1 < char2);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean rs5 = (num3 == num4);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean rs6 = (num5 == num6);
		boolean rs7 = (num5 == (float)num6);
				
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		System.out.println(rs4);
		System.out.println(rs5);
		System.out.println(rs6);
		System.out.println(rs7);
	}

}
