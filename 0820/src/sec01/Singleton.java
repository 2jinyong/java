package sec01;

public class Singleton {
	//�ʵ� private ���ٱ����� ���� �����ʵ带 ����� �����ڷ� �ʱ�ȭ �Ѵ�.
	
	//������ private ���ٱ�ȯ�� ����� �ܺο��� �������� ���ϵ��� �Ѵ�.
	private static Singleton singleton = new Singleton();
			
	//�޼ҵ� public���� �ܺ� ����� �����ϵ��� �����޼ҵ�� �����.
	public static Singleton getInstatnce() {
		return singleton;
	}
}	

