package sec01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를입력하세요.");
		int input = scanner.nextInt();
		
		int num = input;
		
		if( (num==2) || (num%3==0) ) {
			System.out.println("2또는 3의 배수 입니다.");
		}else {
			System.out.println("2또는 3의 배수가 아닙니다.");
		}
		
	}
}
