package exp_3;

class Employee
{
	float salary = 40_000;
}

public class Exp_3g extends Employee {
	
	int bonus = 10_000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp_3g p = new Exp_3g();
		System.out.println("Programmer salary is: " + p.salary);
		System.out.println("Bonus of Programmer is: " + p.bonus);		

	}

}
