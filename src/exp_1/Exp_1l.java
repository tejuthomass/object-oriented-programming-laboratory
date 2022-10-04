package exp_1;
import java.util.Scanner;

public class Exp_1l {

	public static void main(String[] args) {
		int x, y, t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter X: ");
		x = sc.nextInt();
		System.out.print("Enter Y: ");
		y = sc.nextInt();
		
		System.out.println("Before Swap\nX: " + x + "\tY: " +  y);
		t = x;
		x = y;
		y = t;
		System.out.println("After Swap\nX: " + x + "\tY: " +  y);
		
		sc.close();
	}

}
