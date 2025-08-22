package sec01;

//추상 클래스
public abstract class Animal {
	//필드
	String name;
	Animal(String name){
		this.name = name;
	}
	
	//추상 메소드 구현을 하지 않고 이름만 세팅
	abstract void sound();
	
	//일반메소드
	void sleep() {
		System.out.println(name + " (이)가 잠을 잡니다.");
	}
}
