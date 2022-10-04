package exp_1;
import java.util.Scanner;

public class Exp_1f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your roll no: ");
		int rollno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your fee: ");
		double fee = sc.nextDouble();
		
		System.out.println("\nRoll no: " + rollno + "\nName: " + name + "\nFee: " + fee);
		
		sc.close();
	}

}
