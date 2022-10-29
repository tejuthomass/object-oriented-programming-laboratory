package exp_4;

abstract class Shapes
{
	int a, b;
	abstract void printArea();
}

class Rectangle extends Shapes
{
	Rectangle(int x, int y)
	{
		a = x;
		b = y;
	}
	
	void printArea()
	{
		System.out.println("Area of rectangle: " + (a * b));		
	}
}

class Triangle extends Shapes
{
	Triangle(int x, int y)
	{
		a = x;
		b = y;
	}
	
	void printArea()
	{
		System.out.println("Area of triangle: " + (a * b / 2));		
	}
}

class Circle extends Shapes
{
	Circle(int x)
	{
		a = x;
	}
	
	void printArea()
	{
		System.out.println("Area of circle: " + (3.14 * a * a));		
	}
}

public class Main {

	public static void main(String[] args) {
		Shapes a = new Circle(10);
		Shapes b = new Triangle(10, 10);
		Shapes c = new Rectangle(10, 10);
		
		a.printArea();
		b.printArea();
		c.printArea();
	}
}