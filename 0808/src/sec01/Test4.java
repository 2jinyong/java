package sec01;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int input = scanner.nextInt();
		
		int num = input;
		
		if(num>=90 & num<=100) {
			System.out.println("A�����Դϴ�.");
		}else if(num>=80 & num<=90) {
			System.out.println("B�����Դϴ�.");
		}else if(num>=70 & num<=80) {
			System.out.println("C�����Դϴ�.");
		}else if(num>=60 & num<=70) {
			System.out.println("D�����Դϴ�.");
		}else {
			System.out.println("F�����Դϴ�.");
		}
	}

}
