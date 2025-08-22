package sec05;

public class Car {

	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model){
		this.model = model;
	}
	//메소드
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "이(가) 시속 "+ this.speed + "km로 달립니다.");
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
}
