package ch04;

public class Ex4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� : ");
			input = s.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
			else if(input == answer) {
				System.out.println("�������ϴ�.");
				System.out.printf("�õ� Ƚ���� %d���Դϴ�.", count);
				break;
			}
			else {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}
		}while(true);
	}

}
