package sec01;

public class SearchExam {

	public static void main(String[] args) {
		String subject = "저는 자바 프로그래머 입니다.";
		
		int location = subject.indexOf("프로그래머");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		int location2 = subject.indexOf("자바");
		
		if(location != -1) {
			System.out.println("직업: 자바 프로그래머");
		}else {
			System.out.println("직업: 그냥 프로그래머");
		}
			
		boolean rs = subject.contains("자바");
		if(rs) {
			System.out.println("직업: 자바 프로그래머");
		}else {
			System.out.println("직업: 그냥 프로그래머");
		}
		
	}

}
