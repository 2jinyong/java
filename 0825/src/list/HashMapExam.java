package list;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("ȫ�浿", 23);
		map.put("��ö��", 40);
		map.put("���ӽ�", 35);
		map.put("������", 80);                                                                                                                                                                                                                                                                      
		System.out.println("�� Entry tn : " + map.size());
		System.out.println();
		
		String key1 = "ȫ�浿";
		int value = map.get(key1);
		System.out.println("key : " + key1);
		System.out.println("value : " + value);

	}

}
