package ch07;

class Product
{
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product() {}
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {}
	public String toString() {
		return "Tv";
	}
}


public class Ex7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();

	}

}
