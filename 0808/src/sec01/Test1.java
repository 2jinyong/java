package sec01;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자를 하나 입력하세요: ");
        String input = scanner.nextLine();

        if (input.length() > 0) {
            // 문자열의 첫 번째 문자를 char 타입 변수에 저장
            char ch = input.charAt(0);

            System.out.println("입력된 문자는 '" + ch + "' 입니다.");
            System.out.println("아스키 코드 값은: " + (int) ch); // char를 int로 형변환하여 아스키 코드 값 출력

            System.out.print("이 문자의 타입은: ");

            // 아스키 코드 범위를 이용한 타입 판별
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("대문자 알파벳입니다.");
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println("소문자 알파벳입니다.");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("숫자입니다.");
            } else {
                System.out.println("기타 문자입니다.");
            }

        } else {
            System.out.println("입력된 문자가 없습니다.");
        }

        scanner.close();
    }
}