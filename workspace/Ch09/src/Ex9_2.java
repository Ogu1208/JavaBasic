class Person{
	long id;
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id;
		// obj�� Object Ÿ���̹Ƿ� id����  �����ϱ� ���ؼ��� Person�������� ����ȯ�� �ʿ�
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
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
			
		
	}

}
