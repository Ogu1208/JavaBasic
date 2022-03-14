package ch07;

class Outer2 {
	class Inner {
		int iv = 100;
	}
}

public class Ex7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
		
		System.out.println(inner.iv);
	}

}
