package oop2;

public class Bmw extends Car {
	public void color() {
		System.out.println("print the color of the car");
	}
	public void start() {
		System.out.println("start the car from bmw");
	}
	public void stop() {
		System.out.println("stop the car in bmw ");
	}
	public void start(int a) {
		System.out.println("overloading 1");
	}
	public void start(int b,int c) {
		System.out.println("overloading 2");
	}
 
}
