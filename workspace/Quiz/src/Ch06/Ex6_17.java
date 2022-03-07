package Ch06;

public class Ex6_17 {

	public static int[] shuffle(int[] Arr) {
		if(Arr==null | Arr.length==0)
			return Arr;
		
		for(int i = 0; i < Arr.length; i++) {
			int j = (int)(Math.random()*Arr.length);
			int tmp = Arr[i];
			Arr[i] = Arr[j];
			Arr[j] = tmp;
		}
		return Arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
