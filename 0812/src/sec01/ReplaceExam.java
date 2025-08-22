package sec01;

public class ReplaceExam {

	public static void main(String[] args) {
		
		String oldstr = "자바 문자열은 불변이다. 자바 문자열은 String이다.";
		String newstr = oldstr.replace("자바", "JAVA");
		
		System.out.println(oldstr);
		System.out.println(newstr);

		//문자열 자르기 substring(int bindex); bindex 에서 끝까지
		//substring(int bindex, int eindex); bindex에서 eindex의 바로앞까지
		
		String ssn = "991231-1074123";
		String birthday = ssn.substring(0,6);
		String back = ssn.substring(7);
		
		System.out.println(birthday);
		System.out.println(back);
		
		int ind = oldstr.indexOf("문자열");
		if(ind == -1) {
			System.out.println("찾는문자열이없음");
		}else {
			System.out.println(ind);	
		}		
	}

}
