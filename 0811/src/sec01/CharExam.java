package sec01;

public class CharExam {

	public static void main(String[] args) {
		
		String ssn = "9901253220125";
		
		char mf = ssn.charAt(6);
		switch(mf) {
		case '1' : case '3':
			System.out.println("�����Դϴ�.");
			break;
		case '2' : case '4' :
			System.out.println("�����Դϴ�.");
			break;
		}
		
		int length = ssn.length();
		if(length == 13) {
			System.out.println("�ֹι�ȣ�� �½��ϴ�.");
		}else {
			System.out.println("�ֹι�ȣ�� �ƴմϴ�.");
		}
		
	}
}
