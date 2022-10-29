package exp_4;

import java.util.Scanner;

public class Exp_4c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your rollno: ");
		int rollno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
//		sc.next();
		
		System.out.print("Enter your fee: ");
		double fee = sc.nextDouble();
		
		System.out.println("\nRollno: " + rollno + "\nName: " + name + "\nFee: " + fee);
		
		sc.close();

	}

}
