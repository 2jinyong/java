package sec02;

public interface Flyable {
	void fly();
	//java8���Ĺ������� default();
	default void fastfly() {
		System.out.println("������ ���ϴ�.");
	}

}
