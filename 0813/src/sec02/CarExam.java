package sec02;

public class CarExam {

	public static void main(String[] args) {
		
		Car mycar = new Car("�����ڵ���","�׷���","�����",500,30);
		
		System.out.println("����ȸ��: " + mycar.company);
		System.out.println("�𵨸�: " + mycar.model);
		System.out.println("����: " + mycar.color);
		System.out.println("�ְ�ӵ�: " + mycar.maxSpeed);
		System.out.println("����ӵ�: " + mycar.speed);
		
		mycar.speed = 60;
		System.out.println("������ �ӵ� : " +mycar.speed);
	}
}
