package list;

import java.util.List;
import java.util.Vector;

public class VectorExam {

    public static void main(String[] args) throws InterruptedException {

        List<Board> list = new Vector<>();

        // 작업스레드 객체1
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        // 작업스레드 객체2
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        threadA.start();
        threadB.start();

        // 메인 스레드가 threadA와 threadB의 작업이 끝날 때까지 기다린다.
        threadA.join();
        threadB.join();

        // 최종 리스트 크기 출력
        System.out.println("총 객체 수: " + list.size());
    }
}