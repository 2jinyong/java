package sec02;

public class SmartPhoneExam {

	public static void main(String[] args) {
		
		//스마트폰 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시","흰색"); 

		//폰으로부터 상속받은 필드읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("모델 : " + myPhone.color);
		
		//smartPhone 필드읽기
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		//폰의 메소드
		myPhone.bell();
		myPhone.sendVoic("여보세요");
		myPhone.receiveVoic("고객님, 좋은 대출건이 나와서 연락 드렸어요.");
		myPhone.sendVoic("바빠요 끊어요");
		myPhone.hangUp();
		
		//smartPhone의 메소드
		myPhone.setWifi(true); // 와이파이 킴
		myPhone.internet();
	}

}
