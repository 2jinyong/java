package sec03;

public class Float {
	
	public static void main(String[] args) {
	
		//���е� Ȯ��
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println(var1);
		System.out.println(var2);
		
		// e6 = 10�� 6�� 
		// e-6 = 10�� -6��
		double var3 = 3e6;
		double var4 = 3e6f;
		double var5 = 2e-3;
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}