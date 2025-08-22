package sec02;

public class CarExam {

	public static void main(String[] args) {
		
		Car mycar = new Car("현대자동차","그랜저","노랑색",500,30);
		
		System.out.println("제작회사: " + mycar.company);
		System.out.println("모델명: " + mycar.model);
		System.out.println("색상: " + mycar.color);
		System.out.println("최고속도: " + mycar.maxSpeed);
		System.out.println("현재속도: " + mycar.speed);
		
		mycar.speed = 60;
		System.out.println("수정된 속도 : " +mycar.speed);
	}
}
