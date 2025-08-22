package sec02;

public interface Flyable {
	void fly();
	//java8이후버전에서 default();
	default void fastfly() {
		System.out.println("빠르게 납니다.");
	}

}
