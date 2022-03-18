
public class Ex8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		
		try {  // 예외가 발생할 가능성이 있는 문장들
			System.out.println(2);
			System.out.println(3);
		} catch(Exception e) {
			System.out.println(4);
		}
		
		System.out.println(5);
	}

}
