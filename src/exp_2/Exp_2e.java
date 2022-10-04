package exp_2;
import java.util.Scanner;

public class Exp_2e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your rollno: ");
		int rollno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your fee: ");
		double fee = sc.nextDouble();
		
		System.out.println("\nRollno: " + rollno + "\nName: " + name + "\nFee: " + fee);
		
		sc.close();

	}

}
