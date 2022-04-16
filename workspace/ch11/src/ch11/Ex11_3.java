package ch11;
import java.util.*;

public class Ex11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
			System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression:" + expression);
		
		try {   // Exception ��ġ�ϱ� ���� try-catch
			for(int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='(') {    // '('�� ������ push
					st.push(ch+"");
				}else if(ch==')') {   // ¦�� ')'�� ������ push
					st.pop();
				}
			}
			
			if(st.isEmpty()) {   // ������ ������� ��ȣ ��ġ
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			} 
		} catch(EmptyStackException e) {   // ������ ����µ� pop�ϴ°�� Exception �߻�
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		} // try
	}

}
