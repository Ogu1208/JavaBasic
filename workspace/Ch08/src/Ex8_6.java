
public class Ex8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;  // 예외 발생
		} catch(Exception e) {
			System.out.println("예외 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
