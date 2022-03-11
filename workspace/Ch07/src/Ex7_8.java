class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product{
	Tv1() {
		super(100);
	}
	
	// Object Ŭ������ toString()�� �������̵��Ѵ�.
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {super(200);}
	
	public String toString() {return "Computer";}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10];
	int i = 0;
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}

class Ex7_8 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}
}


