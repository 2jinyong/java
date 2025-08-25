package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		// Arraylist �÷��� ����
		List<Board> list = new ArrayList<>();
		
		//��ü�� ���� ����
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		int size = list.size();
		System.out.println("��" + size + "���� ���� �ֽ��ϴ�.");
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
