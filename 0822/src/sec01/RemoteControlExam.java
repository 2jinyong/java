package sec01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		Tv mytv = new Tv();
		SmartPhone myphone = new SmartPhone();
		
		RemoteControl rc;
		RemoteControl rc2;
		rc = new Tv();
		rc2 = new SmartPhone();

		rc.turnOn();
		rc2.turnOn();
	}

}
