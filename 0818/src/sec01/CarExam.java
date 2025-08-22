package sec01;

public class CarExam {

	public static void main(String[] args) {

		//car 객체 생성
		Car myCar = new Car("기아자동차",true,40);
		
//		myCar.model = "현대";
//		myCar.start = true;
//		myCar.speed = 100;
		
		System.out.println(myCar.model);
		System.out.println(myCar.start);
		System.out.println(myCar.speed);
		
	}

}
