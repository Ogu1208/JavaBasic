package Ch06;

public class Ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("È«±æµ¿ ",1,1,100,60,76); 
		String str = s.info();
		System.out.println(str);
		
		System.out.println("ÀÌ¸§ :" + s.name); 
		System.out.println("ÃÑÁ¡ :" + s.getTotal()); 
		System.out.println("Æò±Õ :" + s.getAverage()); 

	}

}

class Student{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		return name 
				+ "," + ban
				+ "," + no
				+ "," + kor
				+ "," + eng
				+ "," + math
				+ "," + (kor+eng+math)
				+ "," + Math.round((kor+eng+math)/3f * 10) / 10.0;
				
	}
	
	int getTotal(){
		return kor + eng + math;
	}
	
	double getAverage() {
		return Math.round((kor+eng+math)/3f * 10) / 10.0;
	}
}