package exp_2;
import java.util.Scanner;

public class Exp_2j {

	public static void main(String[] args) {
		
		int i, n, pos;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the elements");
		for (i = 0; i < n; i++)
		{
			System.out.print("Element " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the position to be deleted: ");
		pos = sc.nextInt();
		
		for (i = pos; i < n - 1; i++)
		{
			a[i] = a[i + 1];
		}
		n--;
		
		System.out.println("\nArray after deletion");
		for (i = 0; i < n; i++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}
}