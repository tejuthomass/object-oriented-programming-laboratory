package exp_1;

public class Exp_1c {
	
	int id;
	String name;
	
	Exp_1c(int i, String n)
	{
		id = i;
		name = n;
	}
	
	void display()
	{
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Exp_1c s1 = new Exp_1c(202101166, "Teju Thomas S");
		Exp_1c s2 = new Exp_1c(202101163, "Taariq Ziyaadh J");
		
		s1.display();
		s2.display();
	}

}
