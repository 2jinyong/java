package sec01;

public class SplitExam {

	public static void main(String[] args) {
		
		String bbs = "1.�ڹ� �н�,����Ÿ�� String�� �н��Ѵ�.,ȫ�浿";

		String[] tokens = bbs.split(",");
		
		System.out.println("���� : " + tokens[0]);
		System.out.println("���� : " + tokens[1]);
		System.out.println("���� : " + tokens[2]);
		
		for(int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		for(String str : tokens) {
			System.out.println(str);
		}
		
		
		
	}

}
