package sec02;

public class SmartPhoneExam {

	public static void main(String[] args) {
		
		//����Ʈ�� ��ü ����
		SmartPhone myPhone = new SmartPhone("������","���"); 

		//�����κ��� ��ӹ��� �ʵ��б�
		System.out.println("�� : " + myPhone.model);
		System.out.println("�� : " + myPhone.color);
		
		//smartPhone �ʵ��б�
		System.out.println("�������� ���� : " + myPhone.wifi);
		
		//���� �޼ҵ�
		myPhone.bell();
		myPhone.sendVoic("��������");
		myPhone.receiveVoic("����, ���� ������� ���ͼ� ���� ��Ⱦ��.");
		myPhone.sendVoic("�ٺ��� �����");
		myPhone.hangUp();
		
		//smartPhone�� �޼ҵ�
		myPhone.setWifi(true); // �������� Ŵ
		myPhone.internet();
	}

}
