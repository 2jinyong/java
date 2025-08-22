package sec01;

public class AccExam {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceApple = 0.1;
		int num = 7;
		
		double rs = apple - (pieceApple*7);
		System.out.println("사과 1개에서 7조각 먹고 남은 양은" + rs + "입니다.");
		
		int totalPiece = apple * 10;
		int rs2 = totalPiece - apple*num;
		System.out.println("사과 1개에서 7조각 먹고 남은 양은" + rs2 + "입니다.");
	}
}
