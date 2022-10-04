package exp_1;
import java.util.Scanner;

public class SortAndSearch {
	static void linearSearch(int a[], int x)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == x)
			{
				System.out.println("Found!");
				return;
			}
		}
		System.out.print("Not Found!");
	}
	
	static void binarySearch(int a[], int x)
	{
		int l = 0, r = a.length - 1;
        while (l <= r) 
        {
            int m = (l + r) / 2;

            if (a[m] == x)
            {
            	System.out.println("Found!");    
            	return;
            }
            if (a[m] < x)
            {
            	l = m + 1;            	
            }
            else
            {
            	r = m - 1;            	
            }
        }
        System.out.println("Not Found!");
	}
	
	static void selectionsort(int a[])
	{
		int n = a.length;
		
		for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
            	if (a[j] < a[min_idx])
            	{
            		min_idx = j;            	            		
            	}
            }
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
	}

	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("$$$ EXPERIMENT 1 $$$\n\nEnter number of elements: ");
		int arr[] = new int[inp.nextInt()];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("Element %d: ", i + 1);
			arr[i] = inp.nextInt();
		}
				
		System.out.print("\nOperations:\n1 - Linear Search\n2 - Binary Search\nYour choice: ");
		
		switch(inp.nextInt())
		{
		case 1:
			System.out.print("Enter your search element: ");
			linearSearch(arr, inp.nextInt());
			break;
		case 2:
			System.out.print("Enter your search element: ");
			selectionsort(arr);
			binarySearch(arr, inp.nextInt());
			break;
		default:
			System.out.println("Invalid choice!");
		}
		inp.close();
	}
}
