package threads1;

import java.util.Scanner;

class Demo2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Printing Characters started");
		for(int i=65;i<=69;i++)
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
	System.out.println("Printing Characters Ended");
	 
}
}
class Demo3 extends Thread
{
	@Override
	public void run()
	{	
		System.out.println("Printing Numbers Started");
		for(int i=1;i<=10;i++)
	{
		System.out.println(i);
	
	try
	{
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	System.out.println("Printing numbers ended");
}
}
class Demo4 extends Thread
{
	 
	@Override 
	public void run()
	{
		System.out.println("Adding Started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
	 int a=scan.nextInt();
	 System.out.println("Enter the Number");
	 int b=scan.nextInt();
	 int c=a+b;
	 System.out.print(c);
	 System.out.println("Adding Ended");
	 
}
}
public class Demo1 {
	public static void main(String[] args) {
		 Demo2 d2=new Demo2();
		 Demo3 d3=new Demo3();
		 Demo4 d4=new Demo4();
		 d2.start();
		 d3.start();
		 d4.start();

	}

}
