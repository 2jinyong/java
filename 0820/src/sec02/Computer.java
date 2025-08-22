package sec02;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
		System.out.println("computer에서 실행");
		return Math.PI * r * r;

	}

}
