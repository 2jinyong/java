package sec02;

public class SmartPhone extends Phone {

	//�ʵ� ����
	public boolean wifi;
	
	//������
	public SmartPhone(String model, String color) {
		super.model = model;
		super.color = color;
		System.out.println("�ڽĻ����� SmartPhone �����");
	}
	//�޼ҵ�
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�.");
	}
	public void internet() {
		System.out.println("���ͳ��� �մϴ�.");
	}
}
