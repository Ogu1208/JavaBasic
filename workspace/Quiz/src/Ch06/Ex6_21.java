package Ch06;

public class Ex6_21 {
	public static int abs(int value) {
	if(value >= 0)
		return value;
	else
		return -value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value+"�� ���밪 :"+abs(value)); 
		value = -10;
		System.out.println(value+"�� ���밪 :"+abs(value)); 
	}

}