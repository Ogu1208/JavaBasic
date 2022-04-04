package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex10_2 {

	public static void main(String[] args) {
		// ������ 1���� ����
		final String[] DAY_OF_WEEK = {"", "��","��","ȭ","��","��","��","��"};
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���.(ex) 2017/05/11)");
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���.(ex) 2017/05/11)");
			}
		} // while
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		
		System.out.println("�Է��Ͻ� ��¥�� " + DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)] + "�����Դϴ�.");
;	}

}
