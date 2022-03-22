
public class Ex8_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}

	static void method1() throws Exception {   
		// 선언부에 발생할 예외를  throws에 지정해야함
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;  // 예외 되던지기 (예외를 다시 발생)
		}
	}
}
