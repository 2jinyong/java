package sec05;

public class Coffe extends Beverage{
	//�ʵ�
	private boolean isHOt;
	
	//������
	public Coffe(int price, boolean isHot) {
		super("Ŀ��",price);
		this.isHOt = isHot;
	}
	
	//override
	@Override
	public void displayInfo() {
		super.displayInfo();
		String hotCool = this.isHOt? "��Ŀ��":"���̽�Ŀ��";
		System.out.println("("+hotCool+")");
	}
}
