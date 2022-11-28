package exp_5;

interface Shapes
{
	public void printArea();
}

class Rectangle implements Shapes
{
	private int a, b;
	
	Rectangle(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void printArea()
	{
		System.out.println("Area of rectangle: " + (a * b));		
	}
}

class Triangle implements Shapes
{
	private int a, b;

	Triangle(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void printArea()
	{
		System.out.println("Area of triangle: " + (a * b / 2));		
	}
}

class Circle implements Shapes
{
	private int a;
	
	Circle(int a)
	{
		this.a = a;
	}
	
	@Override
	public void printArea()
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
