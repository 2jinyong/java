package sec01;

public class Test3 {

	public static void main(String[] args) {
		
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ������ ����");
		}else {
			System.out.println("str1�� str2�� ������ �ٸ���");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ���ڿ��� ����");
		}
		
		String str3 = new String("ȫ�浿");
			
		if(str1.equals(str3)) {
			System.out.println("str1�� str3�� ������ ����");
		}else {
			System.out.println("str1�� str3�� ������ �ٸ���");
		}
	}
}
