package sec02;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
		System.out.println("computer���� ����");
		return Math.PI * r * r;

	}

}
