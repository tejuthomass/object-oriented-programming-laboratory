package exp_4;

abstract class Bike
{
	abstract void run();
}

public class Exp_4d extends Bike {
	
	void run()
	{
		System.out.print("Running safely");
	}
	
	public static void main(String[] args) {
		Bike obj = new Exp_4d();
//		Exp_4d obj = new Exp_4d();
		obj.run();
	}

}
