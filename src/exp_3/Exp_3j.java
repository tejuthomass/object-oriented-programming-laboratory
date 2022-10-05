package exp_3;

class Animal1
{
	void eat()
	{
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("barking...");
	}
}

class Cat extends Animal1
{
	void meow()
	{
		System.out.println("meowing...");
	}
}

public class Exp_3j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.meow();
		c.eat();
//		c.bark();
	}

}
