package ch10;
import java.util.*;
import java.text.*;

public class Ex10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		Date birth = null;
		Date today = null;
		
		System.out.print("birth day=");
		while(sc.hasNextLine()) {
			try {
				birth = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.print("birth day=");
			}
		} // while
		
		System.out.print("today =");
		while(sc.hasNextLine()) {
			try {
				today = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.print("today =");
			}
		} // while
		
		Calendar bth = Calendar.getInstance();
		bth.setTime(birth);
		Calendar td = Calendar.getInstance();
		td.setTime(today);
		
		long diff = (td.getTimeInMillis() - bth.getTimeInMillis()) / (60*60*24*1000);
		
		System.out.println(diff + " days");
	}

}
