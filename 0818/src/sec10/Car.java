package sec10;

public class Car {
	//필드
	
	private int speed;
	private boolean stop;
	
	//메소드
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		if(speed< 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
}
