package sec01;

public class SearchExam {

	public static void main(String[] args) {
		String subject = "���� �ڹ� ���α׷��� �Դϴ�.";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		int location2 = subject.indexOf("�ڹ�");
		
		if(location != -1) {
			System.out.println("����: �ڹ� ���α׷���");
		}else {
			System.out.println("����: �׳� ���α׷���");
		}
			
		boolean rs = subject.contains("�ڹ�");
		if(rs) {
			System.out.println("����: �ڹ� ���α׷���");
		}else {
			System.out.println("����: �׳� ���α׷���");
		}
		
	}

}
