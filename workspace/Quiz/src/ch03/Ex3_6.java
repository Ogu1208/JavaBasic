package ch03;

public class Ex3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F = 100;
		float C = (int)((5/9f * (F-32)) * 100 + 0.5) / 100f;
		
		System.out.printf("f = %d, c = %f", F, C);
	}

}
