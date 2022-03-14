package ch07;

class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	}
}

public class Ex7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();   // 외부 클래스 먼저 생성해야함
		Outer.Inner inner = outer.new Inner();
		
		inner.method1();
	}

}
