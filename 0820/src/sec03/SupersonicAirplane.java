package sec03;

public class SupersonicAirplane extends AirPlane {
	//��� �ʵ� 
	public static final int NORMAL = 1;
	public static final int SUPERSONIC =2;
	
	//���� �ʵ�
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		}else {
			super.fly();
		}
	}
	
	
	
}
