package Thread3;

import java.util.Scanner;

class Demo1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Printing Numbers Started");
		for(int i=1;i<=8;i++)
		{
			System.out.println(i);
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
class Demo2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Printing Numbers Characters");
		for(int i=97;i<=105;i++)
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
		System.out.println("Printing Symbols started");
		for(int i=32;i<=40;i++)
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
		System.out.println("Subtracting numbers");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		System.out.println("Enter the number");
		int b=scan.nextInt();
		int c= a-b;
		System.out.println(c);
		System.out.println("Subtracting ended");
		
	}
}

public class Demo {

	public static void main(String[] args) {
	
		Demo1 d1 =new Demo1();
		Demo2 d2 =new Demo2();
		Demo3 d3 =new Demo3();
		Demo4 d4 =new Demo4();

		d1.start();
		d2.start();
		d3.start();
		d4.start();
}

}
