package sec01;

public class InfinityNanExam {
	
	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
		double z2 = x % y;
		
		System.out.println(z + 2);
		System.out.println(z2 + 2);
		
		if(Double.isInfinite(z) || Double.isNaN(z) || Double.isInfinite(z2)) {
			System.out.println("���� ���� �� �� �����ϴ�.");	
		}else {
			System.out.println(z + 2);
			System.out.println(z2 + 2);
		}
		
	}

}
