package oop2;

public class TestCar {

	public static void main(String[] args) {
		Bmw obj = new Bmw();
		
		
		// overriding
		obj.color();
		obj.start();
		obj.stop();
		
		// overloading 
		obj.color();
		obj.start();
		obj.start(56);
		obj.start(7, 8);
		
	}

}
