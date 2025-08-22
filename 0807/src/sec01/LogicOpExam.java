package sec01;

import java.util.Scanner;

public class LogicOpExam {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자 하나를 입력하세요. >>");
		String input = scanner.nextLine();
		
		char ch = input.charAt(0);
		int charCode = (int) ch;
	
		
		if( (65<= charCode) & (charCode <= 90) ) {
			System.out.println("대문자 입니다.");
		}else if( (97<= charCode)&& (charCode<=122) ) {
			System.out.println("소문자 입니다.");
		}else if( (48 <= charCode) && (charCode <=57) ) {
			System.out.println("0-9 까지의 숫자입니다.");
		}
		
		
	}

}
