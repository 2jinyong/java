package sec01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		System.out.println("�μ��� ���� : " + (num1 + num2)+ "�Դϴ�.");
	}

}
