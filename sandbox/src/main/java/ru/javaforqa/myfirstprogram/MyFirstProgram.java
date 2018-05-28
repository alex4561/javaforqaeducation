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

/*1. Создать класс Point для представления точек на двумерной плоскости. Объекты этого класса должны содержать два атрибута, которые соответствуют координатам точки на плоскости.
2. Создать функцию
public static double distance(Point p1, Point p2)
которая вычисляет расстояние между двумя точками. Для вычисления квадратного корня можно использовать функцию Math.sqrt
3. Сделать запускаемый класс, то есть содержащий функцию
public static void main(String[] args) {...}
и при помощи него убедиться, что функция вычисления расстояния между точками действительно работает. Результат вычисления выводить на экран и контролировать визуально.
4. Реализовать то же самое (вычисление расстояния между двумя точками) при помощи метода в классе Point, и добавить в созданный в предыдущем пункте запускаемый класс примеры
sиспользования метода вместо ранее созданной функции.AB = √(xb - xa)2 + (yb - ya)2
*/