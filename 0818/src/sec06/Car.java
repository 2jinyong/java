package sec06;

public class Car {
	
	//�ʵ�
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void simulate() {
		//��ü ����
		Car myCar = new Car();
		//�ν��Ͻ� ��� ���
		myCar.speed =300;
		myCar.run();
	}
	public static void main(String[] args) {
		//���� �޼ҵ� ȣ��
		simulate();
		
		//�ν��Ͻ� ��� ȣ��
		Car myCar = new Car();
		myCar.speed = 30;
		myCar.run();
	}
}
