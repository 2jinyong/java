package sec01;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // Scanner ��ü ����
        Scanner scanner = new Scanner(System.in);

        System.out.print("���ڸ� �ϳ� �Է��ϼ���: ");
        String input = scanner.nextLine();

        if (input.length() > 0) {
            // ���ڿ��� ù ��° ���ڸ� char Ÿ�� ������ ����
            char ch = input.charAt(0);

            System.out.println("�Էµ� ���ڴ� '" + ch + "' �Դϴ�.");
            System.out.println("�ƽ�Ű �ڵ� ����: " + (int) ch); // char�� int�� ����ȯ�Ͽ� �ƽ�Ű �ڵ� �� ���

            System.out.print("�� ������ Ÿ����: ");

            // �ƽ�Ű �ڵ� ������ �̿��� Ÿ�� �Ǻ�
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("�빮�� ���ĺ��Դϴ�.");
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println("�ҹ��� ���ĺ��Դϴ�.");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("�����Դϴ�.");
            } else {
                System.out.println("��Ÿ �����Դϴ�.");
            }

        } else {
            System.out.println("�Էµ� ���ڰ� �����ϴ�.");
        }

        scanner.close();
    }
}