package ch01;

public class MemberService {
	
	private String id;
	private int password;
	
	public MemberService(String id, int password) {
		this.id = id;
		this.password= password;
	}
	
	public String getId() {
		return this.id;
	}
	public int getPassword() {
		return this.password;
	}
	
	public void login(String id, int password) {
		if(this.id.equals(id) && this.password == password) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}else {
			System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	
	public void logout() {
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}

}
