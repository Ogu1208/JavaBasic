
public class Ex8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch (Exception e) {   // ArithmeticException을 제외한 모든 예외가 처리됨
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
