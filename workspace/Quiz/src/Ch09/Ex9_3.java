package Ch09;

public class Ex9_3 {

	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		
		while(true) {
			pos = src.indexOf(target, pos);
			if(pos!=-1) {
				count++;
				pos += target.length();
			}
			else
				break;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("123450", "AB"));
		
		
	}
	

}
