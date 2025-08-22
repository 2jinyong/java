package sec03;

public class RemoteControlExam {

	public static void main(String[] args) {
		Audio myaudio = new Audio();
		myaudio.turnOn();
		myaudio.setVolume(4);
		myaudio.setMute(true);
		myaudio.setMute(false);
		myaudio.turnOff();
		
		RemoteControl.changeBattery();

	}

}
