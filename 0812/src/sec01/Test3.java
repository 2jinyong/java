package sec01;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		double result = (double)(num1*num2)/2;
		System.out.println(result);
	}
}
