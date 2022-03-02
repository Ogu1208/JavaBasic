package ch05;

import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		ball3 = Arrays.copyOf(ballArr, 3);
		
		for(int i=0;i<ball3.length;i++) {
			System.out.println(ball3[i]);
		}
	}

}
