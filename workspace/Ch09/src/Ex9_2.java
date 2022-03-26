class Person{
	long id;
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id;
		// obj가 Object 타입이므로 id값을  참조하기 위해서는 Person탕비으로 형변환이 필요
		else
			return false;
	}
	
	Person(long id) {
		this.id = id;
	}
}

public class Ex9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(8011081111222l);
		Person p2 = new Person(8011081111222l);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
			
		
	}

}
