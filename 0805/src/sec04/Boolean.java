package sec04;

public class Boolean {
	
	public static void main(String[] args) {
	
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("고 합니다");
		}
		int x = 10;
		boolean rs1 = (x == 20); //f
		boolean rs2 = (x != 20); //t
		System.out.println(rs1);
		System.out.println(rs2);
	}
}
