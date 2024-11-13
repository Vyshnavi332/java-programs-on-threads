package thread5;
class captain extends Thread
{
	public  void run() {
		try
		{
			bowlingcoach bo =new bowlingcoach();
			 bo.setName("BOC");
			 battingcoach ba = new battingcoach();
			 ba.setName("BAC");
		
			 bo.setDaemon(true);
			 ba.setDaemon(true);
			 
			 bo.start();
			 ba.start();
	 
		System.out.println("captain will go to ground");
		Thread.sleep(3000);
		System.out.println("captain will do warm-ups");
		Thread.sleep(3000);
		System.out.println("captain will do catching practice");
		Thread.sleep(3000);
		System.out.println("captain will do batting practice");
		Thread.sleep(3000);
		System.out.println("captain will do bowling practice");
		Thread.sleep(3000);
		System.out.println("captain will go to hotel");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}
class bowlingcoach extends Thread
{
	public void run()
	{
	for(; ;)
	{
		System.out.println("Bowling coach will go to ground");
		try {
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  }
}
class battingcoach extends Thread
{
	public void run()
	{
	for(; ;)
	{
		System.out.println("Batting coach will go to ground");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
  }
}
public class Demo {

	public static void main(String[] args) {
		 captain c=new captain();
		 c.setName("CAPTAIN");
		  c.start();
		
	}

}
