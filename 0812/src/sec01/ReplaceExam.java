package sec01;

public class ReplaceExam {

	public static void main(String[] args) {
		
		String oldstr = "�ڹ� ���ڿ��� �Һ��̴�. �ڹ� ���ڿ��� String�̴�.";
		String newstr = oldstr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldstr);
		System.out.println(newstr);

		//���ڿ� �ڸ��� substring(int bindex); bindex ���� ������
		//substring(int bindex, int eindex); bindex���� eindex�� �ٷξձ���
		
		String ssn = "991231-1074123";
		String birthday = ssn.substring(0,6);
		String back = ssn.substring(7);
		
		System.out.println(birthday);
		System.out.println(back);
		
		int ind = oldstr.indexOf("���ڿ�");
		if(ind == -1) {
			System.out.println("ã�¹��ڿ��̾���");
		}else {
			System.out.println(ind);	
		}		
	}

}
