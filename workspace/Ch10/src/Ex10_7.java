import java.text.*;
public class Ex10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
//			System.out.println(Double.parseDouble("1,234,567.89"));
//			콤마가  포함된 문자열을 숫자로 변환 x
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89" + " -> ");
			
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(num));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
