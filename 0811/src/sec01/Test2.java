package sec01;

public class Test2 {

	public static void main(String[] args) {
		
		String hobby = "여행"; //힙영역에 여행객체가 마련되고 주소가 스택에 저장됨
		hobby = null; //스택에 힙영역 주소가 적혀있다가 null로 바뀜.
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2 : "+ kind2);
	}
}
