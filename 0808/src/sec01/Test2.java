package sec01;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("지금은 몇 월입니까?");
		int input = scanner.nextInt();
		
		int num = input;
		
		if(num >=3 & num <= 5) {
			System.out.println("봄입니다.");
		}else if(num >=6 & num <= 8){
			System.out.println("여름입니다.");
		}else if(num >=9 & num <= 11) {
			System.out.println("가을입니다.");
		}else {
			System.out.println("겨울입니다.");
		}
	}
}
	
