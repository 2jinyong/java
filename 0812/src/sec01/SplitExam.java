package sec01;

public class SplitExam {

	public static void main(String[] args) {
		
		String bbs = "1.자바 학습,참조타입 String을 학습한다.,홍길동";

		String[] tokens = bbs.split(",");
		
		System.out.println("제목 : " + tokens[0]);
		System.out.println("내용 : " + tokens[1]);
		System.out.println("성명 : " + tokens[2]);
		
		for(int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		for(String str : tokens) {
			System.out.println(str);
		}
		
		
		
	}

}
