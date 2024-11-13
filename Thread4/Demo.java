package Thread4;

import java.util.Scanner;

class Demo1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Addition Started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=scan.nextInt();
		System.out.println("Enter the numbers");
		int b=scan.nextInt();
		int c= a+b;
		System.out.println(c);
		System.out.println("Addition Ended");
		
	}
}
class Demo2 extends Thread
{
		@Override
		public void run()
		{
			System.out.println("Printing Numbers started");
			for(int i=48;i<=54;i++)
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
			System.out.println("Printing Numbers Ended");
		}
}
class Demo3 extends Thread
{	
	@Override
		public void run()
		{
			System.out.println("Printing Symbols started");
			for(int i=12;i<=20;i++)
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
class Demo4 extends Thread
{
@Override
public void run()
{
	System.out.println("Printing Characters started");
	for(int i=972;i<=107;i++)
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
class Demo5 extends Thread
{
@Override
public void run()
{
	System.out.println("Printing emojis started");
	for(int i=1;i<=6;i++)
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
	System.out.println("Printing emojis Ended");
}
}
class Demo6 extends Thread
{
@Override
public void run()
{
	System.out.println("Printing SpecialSymbols started");
	for(int i=21;i<=36;i++)
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
	System.out.println("Printing SpecialSymbols Ended");
}
}
public class Demo {

	public static void main(String[] args) {
	Demo1 d1 =new Demo1();
	Demo2 d2 =new Demo2();
	Demo3 d3 =new Demo3();
	Demo4 d4 =new Demo4();
	Demo5 d5=new Demo5();
	Demo6 d6=new Demo6();
	/*d1.start();
	d2.start();
	d3.start();
	d4.start();
	d5.start();
	d6.start();*/
	d1.run();
	d2.run();
	d3.run();
	d4.run();
	d5.run();
	d6.run();

	}

}
