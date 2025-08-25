package list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		//객체 추가
		set.add("java");
		set.add("jdbc");
		set.add("database");
		set.add("jdbc");
		set.add("spring");
		
		int size = set.size();
		System.out.println("저장된 객체 수 : " + size);

		for(String el : set) {
			System.out.println(el);
		}
		
		//iterator(); set을 반복하는 메소드
		//hasNext(); 다음이 있는지 확인 boolean
		
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
