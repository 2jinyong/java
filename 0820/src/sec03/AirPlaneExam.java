package sec03;

public class AirPlaneExam {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); //�������̵��� �޼ҵ�� ����
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); //�������̵��� �޼ҵ�� ����
		sa.land();

		
	}

}
