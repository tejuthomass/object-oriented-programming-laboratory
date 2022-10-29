package exp_4;

public class Exp_4b {
	
	int rollno;
	String name;
	
	void insertRecord(int r, String n)
	{ 
		rollno = r;
		name = n;
	}
	
	void displayInformation()
	{
		System.out.println(rollno + " " + name);
	}

	public static void main(String[] args) 
	{
		Exp_4b s1 = new Exp_4b();
		Exp_4b s2 = new Exp_4b();
		
		s1.insertRecord(111,"Karan");
		s2.insertRecord(222,"Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}

}
