package sec01;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		double result = (double)(num1*num2)/2;
		System.out.println(result);
	}
}
