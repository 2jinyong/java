package sec01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ��Է��ϼ���.");
		int input = scanner.nextInt();
		
		int num = input;
		
		if( (num==2) || (num%3==0) ) {
			System.out.println("2�Ǵ� 3�� ��� �Դϴ�.");
		}else {
			System.out.println("2�Ǵ� 3�� ����� �ƴմϴ�.");
		}
		
	}
}
