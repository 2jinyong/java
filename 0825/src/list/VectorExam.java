package list;

import java.util.List;
import java.util.Vector;

public class VectorExam {

    public static void main(String[] args) throws InterruptedException {

        List<Board> list = new Vector<>();

        // �۾������� ��ü1
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("����" + i, "����" + i, "�۾���" + i));
                }
            }
        };

        // �۾������� ��ü2
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("����" + i, "����" + i, "�۾���" + i));
                }
            }
        };

        threadA.start();
        threadB.start();

        // ���� �����尡 threadA�� threadB�� �۾��� ���� ������ ��ٸ���.
        threadA.join();
        threadB.join();

        // ���� ����Ʈ ũ�� ���
        System.out.println("�� ��ü ��: " + list.size());
    }
}