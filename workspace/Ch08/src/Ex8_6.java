
public class Ex8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ");
			throw e;  // ���� �߻�
		} catch(Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}

}
