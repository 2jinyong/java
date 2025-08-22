package sec01;

public class CharExam {

	public static void main(String[] args) {
		
		String ssn = "9901253220125";
		
		char mf = ssn.charAt(6);
		switch(mf) {
		case '1' : case '3':
			System.out.println("남자입니다.");
			break;
		case '2' : case '4' :
			System.out.println("여자입니다.");
			break;
		}
		
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호가 맞습니다.");
		}else {
			System.out.println("주민번호가 아닙니다.");
		}
		
	}
}
