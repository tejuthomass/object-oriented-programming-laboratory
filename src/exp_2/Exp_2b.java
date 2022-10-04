package exp_2;

public class Exp_2b {
	
	int rollno;
	String name;
	
	void insertRecord(int r, String n)
	{
		rollno = r;
		name = n;
	}
	
	void displayInformation()
	{
		System.out.println(rollno + "\t" + name);
	}

	public static void main(String args[])
	{
		Exp_2b s1 = new Exp_2b();
		Exp_2b s2 = new Exp_2b();
		
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		
		System.out.println("RollNo\tName");
		s1.displayInformation();
		s2.displayInformation();

	}
}
