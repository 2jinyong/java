package sec01;

import java.util.Scanner;

	public class ScannerExam {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���. >>");
		String a = scanner.nextLine();
		System.out.print("���� �� �Է��ϼ���. >>");
		String b = scanner.nextLine();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int rs = x + y ;
		System.out.print("�� ���� ���� : " + rs + "�Դϴ�.");
		
	}
}
