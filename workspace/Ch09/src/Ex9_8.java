
public class Ex9_8 {

	public static void main(String[] args) {
		 // 길이가 0인 char배열 생성
		char[] cArr = new char[0];   //  char[] Arr = {} 와 같다
		String s = new  String(cArr);    // String s = new String("");와 같다 
		
		
		System.out.println("cArr.length" + cArr.length);
		System.out.println("@@@" + s + "@@@");
	}

}
