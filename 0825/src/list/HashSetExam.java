package list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		//��ü �߰�
		set.add("java");
		set.add("jdbc");
		set.add("database");
		set.add("jdbc");
		set.add("spring");
		
		int size = set.size();
		System.out.println("����� ��ü �� : " + size);

		for(String el : set) {
			System.out.println(el);
		}
		
		//iterator(); set�� �ݺ��ϴ� �޼ҵ�
		//hasNext(); ������ �ִ��� Ȯ�� boolean
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String el = iterator.next();
			System.out.println(el);
		}
		
		set.remove("jdbc");
		
		Iterator<String> iterator1 = set.iterator();
		while(iterator1.hasNext()) {
			String el = iterator1.next();
			System.out.println(el);
		}
	}
	
}
