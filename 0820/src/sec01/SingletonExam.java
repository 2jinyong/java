// SingletonExam.java ����

package sec01;

public class SingletonExam {
    public static void main(String[] args) {
        // �ùٸ� ���: getInstance() �޼ҵ带 ���� �̱��� ��ü ���
        Singleton obj1 = Singleton.getInstatnce();
        Singleton obj2 = Singleton.getInstatnce();

        // obj1�� obj2�� ������ ��ü�� �����ϹǷ� ����� "�ΰ��� ��ü�� ����."�� ��µȴ�.
        if (obj1 == obj2) {
            System.out.println("�� ���� ��ü�� ����.");
        } else {
            System.out.println("�� ���� ��ü�� �ٸ���.");
        }
    }
}