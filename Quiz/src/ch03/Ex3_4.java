package ch03;

public class Ex3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples / 10  + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
		System.out.println("�ʿ��� �ٱ����� �� : "+ numOfBucket);
	}

}
