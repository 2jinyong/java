package sec02;

public class Car {
	//필드
	String company;
	String model;
	String color;
	int maxspeed;
	
	//생성자 선언 --생성자 오버로딩
	Car(){}
	Car(String model){
		this.model = model;
	}
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	Car(String model,String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
