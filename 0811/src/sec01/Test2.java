package sec01;

public class Test2 {

	public static void main(String[] args) {
		
		String hobby = "����"; //�������� ���ఴü�� ���õǰ� �ּҰ� ���ÿ� �����
		hobby = null; //���ÿ� ������ �ּҰ� �����ִٰ� null�� �ٲ�.
		
		String kind1 = "�ڵ���";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2 : "+ kind2);
	}
}
