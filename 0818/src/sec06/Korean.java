package sec06;

public class Korean {
	//필드 - 인스턴스 파이널
	final String nation = "대한민국";
	final String ssn;
	
	//인스턴스 필드
	String name;
	
	// 생성자에서 파이널필드 초기화
	public Korean (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
