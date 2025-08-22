package sec01;

import java.util.Scanner;

	public class ScannerExam {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값을 입력하세요. >>");
		String a = scanner.nextLine();
		System.out.print("값을 또 입력하세요. >>");
		String b = scanner.nextLine();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int rs = x + y ;
		System.out.print("두 수의 합은 : " + rs + "입니다.");
		
	}
}
