package Ch06;

public class Ex6_18 {

	public static boolean isNumber(String str) {
		if(str==null || str.equals(""))
			return false;
		
		for(int i = 0; i < str.length(); i++) {
			if(!(str.charAt(i) >= '0' && str.charAt(i)<='9')) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
	}

}
