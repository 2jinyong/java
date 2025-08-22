package sec03;

public class SupersonicAirplane extends AirPlane {
	//상수 필드 
	public static final int NORMAL = 1;
	public static final int SUPERSONIC =2;
	
	//상태 필드
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
		}
	}
	
	
	
}
