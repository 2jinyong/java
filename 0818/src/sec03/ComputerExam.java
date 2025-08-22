package sec03;

public class ComputerExam {

	public static void main(String[] args) {

		//°´Ã¼ »ý¼º
		Computer comp = new Computer();
		
		int rs1 = comp.sum(1,2,3,4);
		System.out.println(rs1);
		
		int rs2 = comp.sum(1,2,3,4,5,6);
		System.out.println(rs2);
		
		int rs3 = comp.sum(new int[] {1,2,3,4,5,6,7,8,9,10});
		System.out.println(rs3);

	}

}
