
public class Ex8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();	 // ���� Ŭ�������� static����̹Ƿ� ��ü�������� ���� ȣ�Ⱑ��.
  	}	// main�޼����� ��

	static void method1() throws Exception {
		method2();
	}	// method1�� ��

	static void method2() throws Exception {
		throw new Exception();
	}

}
