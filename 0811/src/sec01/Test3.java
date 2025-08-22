package sec01;

public class Test3 {

	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같다");
		}else {
			System.out.println("str1과 str2는 참조가 다르다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이 같다");
		}
		
		String str3 = new String("홍길동");
			
		if(str1.equals(str3)) {
			System.out.println("str1과 str3는 참조가 같다");
		}else {
			System.out.println("str1과 str3는 참조가 다르다");
		}
	}
}
