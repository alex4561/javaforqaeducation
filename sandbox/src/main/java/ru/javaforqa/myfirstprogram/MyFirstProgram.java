package ru.javaforqa.myfirstprogram;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Alexander");
/*Создается обьект Squre*/
		Square s = new Square(5);

		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

/*Создается обьект Rectangle*/
        Rectangle r = new Rectangle(4,6);

		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
	

}