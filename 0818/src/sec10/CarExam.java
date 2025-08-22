package sec10;

public class CarExam {

	public void min(String[] args) {
		Car myCar = new Car();
//		myCar.speed = 100;
		myCar.setSpeed(-100);
		System.out.println(myCar.getSpeed());
	}
}
