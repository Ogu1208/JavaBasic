package com.codechobo.book;

public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car=fe;
//		car.water();
		fe2 = (FireEngine)car;
		fe.water();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("dive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{   // ¼Ò¹æÂ÷
	void water() {
		System.out.println("water!!");
	}
}
