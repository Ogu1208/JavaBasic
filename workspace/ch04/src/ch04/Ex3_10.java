package ch04;

public class Ex3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;
		
		System.out.println(c);
		
		long a2 = 1_000_000 * 1_000_000;
		long b2 = 1_000_000 * 1_000_000L;
		
		System.out.println("a2=" + a2);
		System.out.println("b2=" + b2);
	}

}
