package sec01;

public class Test1 {

	public static void main(String[] args) {
		
		String name1;
		String name2;
		String name3;
		
		name1= new String("Ã¶¼ö");
		name2= new String("Ã¶¼ö");
		name3= name2;
		
		System.out.println(name1==name2);;
		
		System.out.println(name1.equals(name2));;
		System.out.println(name2==name3);;
		
		String str = null;
		System.out.println(str);
		//System.out.println(str.length());
		
		int arr[] = null;
		arr[0] = 30;
	}

}
