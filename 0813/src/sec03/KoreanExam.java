package sec03;

public class KoreanExam {

	public static void main(String[] args) {
		
		Korean p1 = new Korean("ȫ�浿","123456-1234567");
		Korean p2 = new Korean("ȫ�浿2","437656-1234567");
		
		System.out.println("ù��° ��� ����: " + p1.nation);
		System.out.println("ù��° ��� �̸�: " + p1.name);
		System.out.println("ù��° ��� �ֹι�ȣ : " + p1.ssn);
		
		System.out.println("�ι�° ��� ����: " + p2.nation);
		System.out.println("�ι�° ��� �̸�: " + p2.name);
		System.out.println("�ι�° ��� �ֹι�ȣ : " + p2.ssn);
	}

}
