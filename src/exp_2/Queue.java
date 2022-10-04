package exp_2;

import java.util.Scanner;

public class Queue {
	
	public final static int SIZE = 7;
	public static int front = -1;
	public static int[] queue = new int[SIZE];
	
	public static boolean isFull()
	{
		if (front == SIZE - 1)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty()
	{
		if (front == -1)
		{
			return true;
		}
		return false;
	}
	
	public static void enqueue()
	{	    
		Scanner inp = new Scanner(System.in);
		
	    if (isFull())
	    {
	    	System.out.println("Queue overflow!!");
	    }
	    else
	    {
	        for (int i = front; i >= 0; i--)
	        {
	        	queue[i + 1] = queue[i];
	        }
	        System.out.print("Enter the element: ");
	        queue[0] = inp.nextInt();
	        System.out.println(queue[0] + " has been successfully enqueued!");
	        front++;
	    }
	}
	
	public static void dequeue()
	{
		if (isEmpty())
	    {
			System.out.println("Queue underflow!!");
	    }
	    else
	    {
	    	System.out.println(queue[front] + " has been successfully dequeued!");
	        front--;
	    }
	}
	
	public static void peek()
	{
		if (isEmpty())
		{
		    System.out.println("Queue underflow!!");
		}
		else
		{
			System.out.println("Front element of your queue is " + queue[front]);
		}	
	}
	
	public static void display()
	{	    
	    if (isEmpty())
	    {
	    	System.out.println("Queue underflow!!");
	    }
	    else
	    {
	    	System.out.println("Your Queue");
	        for (int i = 0; i <= front; i++)
	        {
	        	System.out.println(queue[i]);
	        }
	    }
	}

	public static void main(String[] args) {
		int ch;
		Scanner in = new Scanner(System.in);
		
		System.out.println("$$$ QUEUE IMPLEMENTATION USING ARRAY $$$");
	    
	    while (true)
	    {
	    	System.out.print("\nSelect any operation:\n1 - Enqueue\t2 - Dequeue\t3 - Peek\t4 - Display\t5 - Exit\n\nYour choice: ");
	    	ch = in.nextInt();
	    
	        switch (ch)
	        {
	        case 1:
	            enqueue();
	            break;
	        case 2:
	            dequeue();
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
