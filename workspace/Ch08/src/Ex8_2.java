
public class Ex8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		
		try {  // ���ܰ� �߻��� ���ɼ��� �ִ� �����
			
			System.out.println(0/0);
			System.out.println(2);
//			1�� ����� ���� try������ ���ܰ� �߻��� try���� �ٷ� ����� 2�� ��µ��� �ʴ´�.
		} catch(ArithmeticException ae) {
			System.out.println(3);
		}
		
		System.out.println(4);
	}

}
