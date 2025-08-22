// SingletonExam.java 파일

package sec01;

public class SingletonExam {
    public static void main(String[] args) {
        // 올바른 방법: getInstance() 메소드를 통해 싱글톤 객체 얻기
        Singleton obj1 = Singleton.getInstatnce();
        Singleton obj2 = Singleton.getInstatnce();

        // obj1과 obj2는 동일한 객체를 참조하므로 결과는 "두개의 객체는 같다."가 출력된다.
        if (obj1 == obj2) {
            System.out.println("두 개의 객체는 같다.");
        } else {
            System.out.println("두 개의 객체는 다르다.");
        }
    }
}