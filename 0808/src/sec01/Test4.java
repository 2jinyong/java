package sec01;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int input = scanner.nextInt();
		
		int num = input;
		
		if(num>=90 & num<=100) {
			System.out.println("A학점입니다.");
		}else if(num>=80 & num<=90) {
			System.out.println("B학점입니다.");
		}else if(num>=70 & num<=80) {
			System.out.println("C학점입니다.");
		}else if(num>=60 & num<=70) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
	}

}
