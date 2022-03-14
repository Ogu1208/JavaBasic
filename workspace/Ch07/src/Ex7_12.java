
public class Ex7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
	
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;     // 에러! static 변수 선언 X
		final static int CONST = 100;   // final static은 상수이므로 O
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;   // static 크래스만 static 멤버를 정의할 수 있다.
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;   static 변수 선언 X
			final static int CONST = 300;
		}
	}
}
