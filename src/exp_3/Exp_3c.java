package exp_3;

import java.util.Scanner;

public class Exp_3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your rollno: ");
		int rollno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your fee: ");
		double fee = sc.nextDouble();
		
		System.out.print("\nRollno: " + rollno + "\nName: " + name + "\nFee: " + fee);
		
		sc.close();

	}

}
