package sec01;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("요일을 입력하세요. ex)월");
		String input = scanner.next();
		
		if(input.equals("토") || input.equals("일")) {
			System.out.println("주말입니다.");
		}else {
			System.out.println("평일입니다.");
		}


	}
}
	
