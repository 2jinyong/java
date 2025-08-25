package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		// Arraylist 컬렉션 생성
		List<Board> list = new ArrayList<>();
		
		//객체에 값을 담음
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		int size = list.size();
		System.out.println("총" + size + "개의 글이 있습니다.");
		System.out.println();
		
		Board board = list.get(2);
		System.out.println(board.getSubject() + "," + board.getContent() + "," + board.getWriter());
		
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "," + b.getContent() + "," + b.getWriter());
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "," + b.getContent() + "," + b.getWriter());
		}

	}

}
