package ch07;

class Outer3{
	static class Inner{
		int iv = 200;
	}
}
public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3.Inner oi = new Outer3.Inner();
		
		System.out.println(oi.iv);
	}

}
