package list;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("È«±æµ¿", 23);
		map.put("¾ÈÃ¶¼ö", 40);
		map.put("Á¦ÀÓ½º", 35);
		map.put("´õ·³ÇÁ", 80);                                                                                                                                                                                                                                                                      
		System.out.println("ÃÑ Entry tn : " + map.size());
		System.out.println();
		
		String key1 = "È«±æµ¿";
		int value = map.get(key1);
		System.out.println("key : " + key1);
		System.out.println("value : " + value);

	}

}
