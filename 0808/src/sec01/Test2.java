package sec01;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �� ���Դϱ�?");
		int input = scanner.nextInt();
		
		int num = input;
		
		if(num >=3 & num <= 5) {
			System.out.println("���Դϴ�.");
		}else if(num >=6 & num <= 8){
			System.out.println("�����Դϴ�.");
		}else if(num >=9 & num <= 11) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�ܿ��Դϴ�.");
		}
	}
}
	
