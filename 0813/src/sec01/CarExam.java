package sec01;

public class CarExam {

	public static void main(String[] args) {
		
		Car car = new Car();
		//필드값 읽어보기
		System.out.println("모델명: " + car.model);
		System.out.println("현재속도: " + car.speed);
		System.out.println("시동여부: " + car.start);
	}

}
