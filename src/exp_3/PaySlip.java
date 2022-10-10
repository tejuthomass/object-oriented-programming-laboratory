package exp_3;
import java.util.Scanner;

class Emp
{
    String name, address, email, phone;
    int id;
    double bp;
    
    Emp(int id, String name, String email, String phone, String address)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    void displayPaySlip()
    {
        double da, scf, pf, hra, gross;
        da = 0.97 * bp;
        scf = 0.001 * bp;
        pf = 0.12 * bp;
        hra = 0.1 * bp;
        gross = bp + da + scf + hra;
        
        System.out.println("*********************** PAYSLIP ***********************");
        System.out.printf("\n%-7s: %s\n%-7s: %d\n%-7s: %s\n%-7s: %s\n%-7s: %s", "Name", name, "ID", id, "E-mail", email, "Address", address, "Phone", phone);
        System.out.printf("\n\n%-25s%-11s%-25s%-11s\n", "EARNINGS", "AMOUNT", "DEDUCTIONS", "AMOUNT");
        System.out.printf("%-25s%-11.2f%-25s%-11.2f\n", "Basic Pay", bp, "Provident Fund", pf);
        System.out.printf("%-25s%-11.2f\n", "House Rent Allowance", hra);
        System.out.printf("%-25s%-11.2f\n", "Dearness Allowance", da);
        System.out.printf("%-25s%-11.2f\n", "Staff Club Fund", scf);
        System.out.printf("\n%-12s: %.2f\n%-12s: %.2f\n\n", "Gross Salary", gross, "Net Salary", gross - pf);
        System.out.println("*******************************************************");
    }
}

class Programmer extends Emp
{
    Programmer(int id, String name, String email, String phone, String address)
    {
        super(id, name, email, phone, address);
        super.bp = 10_000;
    }
}

class AssistantProf extends Emp
{
    AssistantProf(int id, String name, String email, String phone, String address)
    {
        super(id, name, email, phone, address);
        super.bp = 8_000;
    }
}

class AssociateProf extends Emp
{
    AssociateProf(int id, String name, String email, String phone, String address)
    {
        super(id, name, email, phone, address);
        super.bp = 7_000;
    }
}

class Professor extends Emp
{
    Professor(int id, String name, String email, String phone, String address)
    {
        super(id, name, email, phone, address);
        super.bp = 11_000;
    }
}


public class PaySlip
{
    static String name, address, email, phone;
    static int id;
    
    public static void getDetails()
    {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("\n\nEnter the details of the employee below\nID: ");
        id = inp.nextInt();
        inp.nextLine();
        System.out.print("Name: ");
        name = inp.nextLine();
        System.out.print("E-mail: ");
        email = inp.next();
        inp.nextLine();
        System.out.print("Address: ");
        address = inp.nextLine();
        System.out.print("Phone: ");
        phone = inp.next();
        System.out.print("\n");
    }
    
	public static void main(String[] args) 
	{
        Scanner inp = new Scanner(System.in);			
        
        System.out.println("$$$ PAYSLIP GENERATOR $$$");
        while (true)
        {
            System.out.print("\nSelect any designation:\n1 - Programmer\n2 - Assistant Professor\n3 - Associate Professor\n4 - Professor\n5 - Exit...\n\nYour Choice: ");

            switch(inp.nextInt())
            {
            case 1:
                getDetails();
                Programmer e1 = new Programmer(id, name, email, phone, address);
                e1.displayPaySlip();
                break;	
            case 2:
                getDetails();
                AssistantProf e2 = new AssistantProf(id, name, email, phone, address);
                e2.displayPaySlip();
                break;
            case 3:
                getDetails();
                AssociateProf e3 = new AssociateProf(id, name, email, phone, address);
                e3.displayPaySlip();
                break;
            case 4:
                getDetails();
                Professor e4 = new Professor(id, name, email, phone, address);
                e4.displayPaySlip();
                break;
            case 5:
                System.out.println("Successfully exited!");
	        	System.exit(0);
	        default:
	        	System.out.println("Invalid Choice!!");
            }
        }
	}
}
