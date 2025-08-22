package sec02;

public class SmartPhone extends Phone {

	//필드 선언
	public boolean wifi;
	
	//생성자
	public SmartPhone(String model, String color) {
		super.model = model;
		super.color = color;
		System.out.println("자식생성자 SmartPhone 실행됨");
	}
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
}
