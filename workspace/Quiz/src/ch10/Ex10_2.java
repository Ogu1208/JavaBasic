package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex10_2 {

	public static void main(String[] args) {
		// 요일은 1부터 시작
		final String[] DAY_OF_WEEK = {"", "일","월","화","수","목","금","토"};
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(ex) 2017/05/11)");
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(ex) 2017/05/11)");
			}
		} // while
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		
		System.out.println("입력하신 날짜는 " + DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
;	}

}
