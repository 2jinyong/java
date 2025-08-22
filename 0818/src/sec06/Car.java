package sec06;

public class Car {
	
	//필드
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed =300;
		myCar.run();
	}
	public static void main(String[] args) {
		//정적 메소드 호출
		simulate();
		
		//인스턴스 멤버 호출
		Car myCar = new Car();
		myCar.speed = 30;
		myCar.run();
	}
}
