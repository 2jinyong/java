package sec03;

public class AirPlaneExam {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); //오버라이딩된 메소드로 실행
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); //오버라이딩된 메소드로 실행
		sa.land();

		
	}

}
