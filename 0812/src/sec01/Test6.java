package sec01;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���.");
		String input = sc.nextLine();
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());

	}

}
