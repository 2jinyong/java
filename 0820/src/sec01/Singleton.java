package sec01;

public class Singleton {
	//필드 private 접근권한을 갖는 정적필드를 만들어 생성자로 초기화 한다.
	
	//생성자 private 접근권환을 만들어 외부에서 접근하지 못하도록 한다.
	private static Singleton singleton = new Singleton();
			
	//메소드 public으로 외부 사용이 가능하도록 정적메소드로 만든다.
	public static Singleton getInstatnce() {
		return singleton;
	}
}	

