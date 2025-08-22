package sec01;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		String str = sc.nextLine();
		
		char target ='a';
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)== target) {
				count ++;
			}
		}
		System.out.println("a의 개수는 " + count + "개 입니다.");
		
		
	}
}
