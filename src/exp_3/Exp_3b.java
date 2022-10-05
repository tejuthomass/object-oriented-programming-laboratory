package exp_3;

public class Exp_3b {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp_3b s1 = new Exp_3b();
		Exp_3b s2 = new Exp_3b();
		
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();

	}

}
