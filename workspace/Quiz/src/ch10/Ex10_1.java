package ch10;
import java.util.*;
import java.text.*;

public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date = Calendar.getInstance();
		date.set(2020, 01,01);
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat(pattern);
		
		for(int i = 0; i < 12; i++) {
			date.set(2020, i,01);
			for(int j = 1; j <=7; j++) {
				if(date.get(Calendar.DAY_OF_WEEK)==1)
					break;
				date.add(Calendar.DATE, 1);
			}
			date.add(Calendar.DATE, 7);
			Date d1 = new Date(date.getTimeInMillis());  // date오ㅏ callendar 변환
			System.out.println(sdf.format(d1) + "은 " + date.get(Calendar.DAY_OF_WEEK_IN_MONTH)
								+ " 번째 일요일입니다.");
			
		}
	}

}
