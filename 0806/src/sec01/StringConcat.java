package sec01;

public class StringConcat {
	
	public static void main(String[] args) {
		
		int rs1 = 10 + 2 + 8;
		System.out.println(rs1);
		
		String rs2 = 10 + 2 + "8";   //128
		String rs3 = 10 + "2" + 8;   //1028
		String rs4 = "10" + 2 + 8;   //1082
		String rs5 = "10" + (2 + 8); //1010
		
		System.out.println(rs2);
		System.out.println(rs3);
		System.out.println(rs4);
		System.out.println(rs5);
		
	}
}
