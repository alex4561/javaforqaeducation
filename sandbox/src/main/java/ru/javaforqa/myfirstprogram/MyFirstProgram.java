package ru.javaforqa.myfirstprogram;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");
		hello("uers");
		hello("Alexander");

/*Считаем расстояние между точками*/
		/*Выводим результат*/
		Point p1 = new Point(2,4, 3, 6);
		/*Point p2 = new Point(3,6);*/
		/*System.out.println("Расстояние между точками равно "+ getDistance(AxisX1,AxisY1,AxisX2,AxisY2));*/
		System.out.println("Расстояние между точками равно "+ p1.getDistance());
   /* System.out.println("Расстояние между точками равно "+ p2.getDistance());*/

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	/*public static double getDistance(Point p1, Point p2){
		return Math.sqrt(Math.pow(Double.parseDouble(String.valueOf(p1.AxisX-p2.AxisX)),2)+(Math.pow(Double.parseDouble(String.valueOf(p2.AxisY-p1.AxisY)),2)));
	}*/

}
