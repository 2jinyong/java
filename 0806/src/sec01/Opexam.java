package sec01;

public class Opexam {
	
	public static void main(String[] args) {
		
		byte rs1 = 10 + 20; // ������ �ܰ迡�� ����
		System.out.println(rs1);

		byte rs2 = 10;
		byte rs3 = 20;
		int rs4 = rs2 + rs3;
		System.out.println(rs4); // intŸ������ ��ȯ �� ����
		
		byte v1 = 10;
		int v2 = 100;
		long v3 = 100L;
		long rs5 = v1 + v2 + v3; // ���� ū Ÿ���� long���� ��ȯ �� ����
		System.out.println(rs5);
		
		char v4 = 'A';
		int v5 = '1';
		int rs6 = v4 + v5;
		System.out.println(rs6);
		
		int v6 = 8;
		int rs7 = v6/3;
		System.out.println(rs7); //������ ������ ����� ����
		
		double rs8 = v6/3.0; //�Ǽ��� ��ȯ�� �����ؾ� �Ǽ�Ÿ�� ����� ����
		System.out.println(rs8);
		
		int v7 = 3;
		double rs9 = (double) v6/v7;
		System.out.println(rs9);
		
	}

}
