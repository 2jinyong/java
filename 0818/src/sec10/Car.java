package sec10;

public class Car {
	//�ʵ�
	
	private int speed;
	private boolean stop;
	
	//�޼ҵ�
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
