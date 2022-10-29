package exp_4;

abstract class Shape
{
	abstract void draw();
}

class Rectangle1 extends Shape
{
	void draw()
	{
		System.out.println("Drawing rectangle");
	}
}

class Circle1 extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle");
	}
}

public class Exp_4e {

	public static void main(String[] args) {
		Shape s = new Circle1();
		s.draw();
	}
}