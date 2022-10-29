package exp_4;

abstract class Bikes
{
	Bikes()
	{
		System.out.println("Bike is created");
	}
	
	abstract void run();
	
	void changeGear()
	{
		System.out.println("Gear changed");
	}
}

class Honda extends Bikes
{
	void run()
	{
		System.out.println("Running safely");
	}
}

public class Exp_4g {

	public static void main(String[] args) {
		Bikes obj = new Honda();
		obj.run();
		obj.changeGear();
	}

}
