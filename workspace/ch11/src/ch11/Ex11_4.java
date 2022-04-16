package ch11;
import java.util.*;
public class Ex11_4 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;  // Queue에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;  // 아무것도 입력하지 않았으면 continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					// 입력받은 명령어를 저장하고,
					save(input);
					
					// LinkedList의 내용 출력
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		}
	}
	
	public static void save(String input) {
		// queue에 저장한다.
		if(!"".equals(input))
			q.offer(input);
		
		// queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if(q.size() > MAX_SIZE)  // size는 Collection인터페이스에 정의되어있다.
			q.remove();
		// 처음부터 queue 크기를 지정한건 아니고 임의로 비교해서 크기처럼 생각
	}

}
