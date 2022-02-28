package ch04;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int s = 1;
		int num = 0;
		
		for(int i = 1; true; i++, s=-s) {
			num = s * i;
			sum += num;
			
			if(sum >= 100)
				break;
		}
		
		System.out.printf("sum=%d, i=%d", sum, num);
	}

}
