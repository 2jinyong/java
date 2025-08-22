package sec03;

public class KoreanExam {

	public static void main(String[] args) {
		
		Korean p1 = new Korean("홍길동","123456-1234567");
		Korean p2 = new Korean("홍길동2","437656-1234567");
		
		System.out.println("첫번째 사람 국가: " + p1.nation);
		System.out.println("첫번째 사람 이름: " + p1.name);
		System.out.println("첫번째 사람 주민번호 : " + p1.ssn);
		
		System.out.println("두번째 사람 국가: " + p2.nation);
		System.out.println("두번째 사람 이름: " + p2.name);
		System.out.println("두번째 사람 주민번호 : " + p2.ssn);
	}

}
