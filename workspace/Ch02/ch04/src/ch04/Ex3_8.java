package ch04;

public class Ex3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 30;
//		byte c = a + b;   cannot convert int to byte
		
		byte c = (byte)(a * b);
		System.out.println(c);
		
	}

}
