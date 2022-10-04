package exp_2;

import java.util.Scanner;

public class Stack {
    
	public final static int SIZE = 7;
	public static int top = -1;
	public static int[] stack = new int[SIZE];
	
	public static boolean isFull()
	{
		if (top == SIZE - 1)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty()
	{
		if (top == -1)
		{
			return true;
		}
		return false;
	}
	
	public static void push()
	{
		Scanner inp = new Scanner(System.in);
		
		if (isFull())
		{
			System.out.println("Stack overflow!!");
		}
		else
		{
			top++;
			System.out.print("Enter the element: ");
			stack[top] = inp.nextInt();
			System.out.println(stack[top] + " has been successfully pushed into stack!");
		}
//		inp.close();
	}
	
	public static void pop()
	{
		if (isEmpty())
	    {
	        System.out.println("Stack underflow!!");
	    }
	    else
	    {
	        System.out.println(stack[top] + " has been successfully popped out of stack!");
	        top--;
	    }
	}
	
	public static void peek()
	{
		if (isEmpty())
	    {
	        System.out.println("Stack underflow!!");
	    }
		else
		{
			System.out.println("Top element of your stack is " + stack[top]);
		}	
	}
	
	public static void display()
	{
		if (isEmpty())
	    {
			System.out.println("Stack underflow!!");
	    }
	    else
	    {
	    	System.out.println("Your stack:");
	        for (int i = top; i >= 0; i--)
	        {
	        	System.out.println(stack[i]);
	        }
	    }
	}

	public static void main(String[] args) {
	
	    int ch;
	    
		Scanner in = new Scanner(System.in);
		
		System.out.println("$$$ STACK IMPLEMENTATION USING ARRAY $$$");
		while (true)
	    {
	        System.out.print("\nSelect any operation:\n1 - PUSH\n2 - POP\n3 - PEEK\n4 - DISPLAY\n5 - EXIT\n\nYour choice: ");
	        ch = in.nextInt();
	        
	        switch (ch)
	        {
	        case 1:
	            push();
	            break;
	        case 2:
	            pop();
	            break;
	        case 3:
	        	peek();
	            break;
	        case 4:
	        	display();
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
