package ch10_quiz;
import java.util.*;
import java.text.*;

public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);
		
		for(int i = 0; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			// 1일이 일요일인 경우 두번쨰 일요일은 8일이고
			// 1일이 다른 요일일 떄는 16에서 1의 요일(weekday)을 빼면 알 수 있다.
			int secondSunday = (weekday==1) ? 8 : 16-weekday;
			
			// 두 번째 일요일(secondSunday)로 cal의 날짜(DAY_OF_MONTH)를 바꾼다.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();  // Calendar -> Date
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
			
			// 날짜를 다음날 1일ㄹ로 변경
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
