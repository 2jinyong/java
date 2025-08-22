package sec01;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("점수를 입력하세요.");
			int num = sc.nextInt();
			sum +=num;
			System.out.println(sum);
			if(sum>100) break;
		}
			
		
	}
}
