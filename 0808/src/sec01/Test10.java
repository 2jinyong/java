package sec01;

public class Test10 {

	public static void main(String[] args) {

		while(true) {
		int i = (int)(Math.random()*6)+1;
		int i2 =(int)(Math.random()*6)+1;
		int total = i+i2;
		
		System.out.println("주사위 1: "+i + " 주사위 2: "+i2);
		
		if(total==5)break;
		}
	}
}
