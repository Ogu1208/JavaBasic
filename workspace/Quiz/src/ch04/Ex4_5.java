package ch04;

public class Ex4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		while(i<10) {
			j = 0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
