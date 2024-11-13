package Threads2;

import java.util.Scanner;

class Demo1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Printing Symbols Started");
		for(int i=58;i<=64;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Printing Symbols Ended");
		
	}
	
}
class Demo2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Adding started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=scan.nextInt();
		System.out.println("Enter the Number");
		int b=scan.nextInt();
		System.out.println("Enter the Number");
		int c=scan.nextInt();
		int d=a+b+c;
		System.out.println(d);
		System.out.println("Adding Ended");
	}
}

public class Demo {

	public static void main(String[] args) {
	Demo1 d1=new Demo1();
	Demo2 d2=new Demo2();
	d1.start();
	d2.start();

	}

}
