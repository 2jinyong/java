package sec01;

//�߻� Ŭ����
public abstract class Animal {
	//�ʵ�
	String name;
	Animal(String name){
		this.name = name;
	}
	
	//�߻� �޼ҵ� ������ ���� �ʰ� �̸��� ����
	abstract void sound();
	
	//�Ϲݸ޼ҵ�
	void sleep() {
		System.out.println(name + " (��)�� ���� ��ϴ�.");
	}
}
