
public class Ex7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
	
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;     // ����! static ���� ���� X
		final static int CONST = 100;   // final static�� ����̹Ƿ� O
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;   // static ũ������ static ����� ������ �� �ִ�.
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;   static ���� ���� X
			final static int CONST = 300;
		}
	}
}
