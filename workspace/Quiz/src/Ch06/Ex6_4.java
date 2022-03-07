package Ch06;

public class Ex6_4 {

	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDistance(1,1,2,2));

	}

}
