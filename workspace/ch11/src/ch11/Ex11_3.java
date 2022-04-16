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
		
		try {   // Exception 설치하기 위한 try-catch
			for(int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='(') {    // '('를 만나면 push
					st.push(ch+"");
				}else if(ch==')') {   // 짝꿍 ')'를 만나면 push
					st.pop();
				}
			}
			
			if(st.isEmpty()) {   // 스택이 비었으면 괄호 일치
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			} 
		} catch(EmptyStackException e) {   // 스택이 비었는데 pop하는경우 Exception 발생
			System.out.println("괄호가 일치하지 않습니다.");
		} // try
	}

}
