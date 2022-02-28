package ch04;

public class Ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i = 1; i <=6; i++) {
			for(j = 1; j <= 6; j++) {
				if(i+j == 6)
					System.out.printf("(%d, %d) ", i, j);
			}
		}
	}

}
