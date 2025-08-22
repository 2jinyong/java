package sec06;

public class Promotion {

	public static void main(String[] args) {
		
		//자동타입변환 
		byte byteVal = 10;
		int intVal = byteVal;
		System.out.println(intVal);
		
		char charVal = '가';
		intVal = charVal;
		System.out.println(intVal);

		intVal = 50;
		long longVal = intVal;
		System.out.println(longVal);
		
		longVal = 100;
		float floatVal = longVal;
		System.out.println(floatVal);
		
		floatVal = 100.5f;
		double doubleVal = floatVal;
		System.out.println(doubleVal);
		
		byte a = 10;
		byte b = 20;
		int ByteVal = a+b;
		System.out.println(ByteVal);
		
		
	}

}
