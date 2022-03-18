
public class Ex8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		
		try {  // 예외가 발생할 가능성이 있는 문장들
			
			System.out.println(0/0);
			System.out.println(2);
//			1을 출력한 다음 try블럭에서 예외가 발생해 try블럭을 바로 벗어나서 2는 출력되지 않는다.
		} catch(ArithmeticException ae) {
			System.out.println(3);
		}
		
		System.out.println(4);
	}

}
