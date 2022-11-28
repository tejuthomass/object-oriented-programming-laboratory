package exp_7;

import java.util.Random;

class Even implements Runnable 
{
	private int x;
	
	public Even(int x)
	{
		this.x = x;
	}
	
	@Override
	public void run()
	{
		System.out.println("Thread Name: Even Thread and square is: " + x * x);
	}
}

class Odd implements Runnable
{
	private int x;
	
	public Odd(int x)
	{
		this.x = x;
	}
	
	@Override
	public void run()
	{
		System.out.println("Thread Name: Odd Thread and cube is :" + x * x * x);
	}
}

class A extends Thread
{
	public Random r;
	public Thread t1, t2;
	
	@Override
	public void run()
	{
		int num;
		r = new Random();
		
		try 
		{
			for (int i = 0; i < 10; i++)
			{
				num = r.nextInt(100);
				System.out.println("Main thread and generated number is " + num);
				if(num % 2 == 0)
				{
					t1 = new Thread(new Even(num));
					t1.start();
				}
				else
				{
					t2=new Thread(new Odd(num));
					t2.start();
				}
				Thread.sleep(1000);
				System.out.println("------------------------------------");
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.start();
	}
}
