package sec05;

public class Car {

	//�ʵ�
	String model;
	int speed;
	
	//������
	Car(String model){
		this.model = model;
	}
	//�޼ҵ�
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "��(��) �ü� "+ this.speed + "km�� �޸��ϴ�.");
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
}
