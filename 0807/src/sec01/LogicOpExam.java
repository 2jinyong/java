package sec01;

import java.util.Scanner;

public class LogicOpExam {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��ϼ���. >>");
		String input = scanner.nextLine();
		
		char ch = input.charAt(0);
		int charCode = (int) ch;
	
		
		if( (65<= charCode) & (charCode <= 90) ) {
			System.out.println("�빮�� �Դϴ�.");
		}else if( (97<= charCode)&& (charCode<=122) ) {
			System.out.println("�ҹ��� �Դϴ�.");
		}else if( (48 <= charCode) && (charCode <=57) ) {
			System.out.println("0-9 ������ �����Դϴ�.");
		}
		
		
	}

}
