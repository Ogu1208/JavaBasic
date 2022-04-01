import java.util.*;
import java.text.*;

public class Ex10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date d = df.parse("2022년 04월 01일");
			System.out.println(df2.format(d));
		} catch(Exception e) {}
	}

}
