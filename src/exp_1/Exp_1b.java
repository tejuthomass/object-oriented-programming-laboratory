package exp_1;

class Student
{
	int roll;
	String name;
	
	void insertRec(int r, String n)
	{
		roll = r;
		name = n;
	}
	
	void display()
	{
		System.out.println("Name: " + name + "\nRoll no: " + roll);
		System.out.println();
	}
}

public class Exp_1b {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.insertRec(202101166, "Teju Thomas S");
		s2.insertRec(202101163, "Taariq Ziyaadh J");
		
		s1.display();
		s2.display();
	}

}
