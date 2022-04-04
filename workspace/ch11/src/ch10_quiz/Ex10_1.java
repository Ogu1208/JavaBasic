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
			// 1���� �Ͽ����� ��� �ι��� �Ͽ����� 8���̰�
			// 1���� �ٸ� ������ ���� 16���� 1�� ����(weekday)�� ���� �� �� �ִ�.
			int secondSunday = (weekday==1) ? 8 : 16-weekday;
			
			// �� ��° �Ͽ���(secondSunday)�� cal�� ��¥(DAY_OF_MONTH)�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();  // Calendar -> Date
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			// ��¥�� ������ 1�Ϥ��� ����
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
