package sec01;

public class Opexam {
	
	public static void main(String[] args) {
		
		byte rs1 = 10 + 20; // 컴파일 단계에서 연산
		System.out.println(rs1);

		byte rs2 = 10;
		byte rs3 = 20;
		int rs4 = rs2 + rs3;
		System.out.println(rs4); // int타입으로 변환 후 연산
		
		byte v1 = 10;
		int v2 = 100;
		long v3 = 100L;
		long rs5 = v1 + v2 + v3; // 가장 큰 타입인 long으로 변환 후 연산
		System.out.println(rs5);
		
		char v4 = 'A';
		int v5 = '1';
		int rs6 = v4 + v5;
		System.out.println(rs6);
		
		int v6 = 8;
		int rs7 = v6/3;
		System.out.println(rs7); //정수형 연산의 결과는 정수
		
		double rs8 = v6/3.0; //실수로 변환후 연산해야 실수타입 결과를 받음
		System.out.println(rs8);
		
		int v7 = 3;
		double rs9 = (double) v6/v7;
		System.out.println(rs9);
		
	}

}
