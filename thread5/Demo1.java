package thread5;
class Hero extends Thread
{
	@Override
	public void run() {
		try{
			lightman l=new lightman();
		
		l.setName("LIGHTMAN");
		cameraman c=new cameraman();
		c.setName("CAMERAMAN");
		
		
		l.setDaemon(true);
		c.setDaemon(true);
		 
		l.start();
		c.start();
		
	System.out.println("Hero will go to the set");
	Thread.sleep(3000);
	System.out.println("Hero will get makeup");
	Thread.sleep(3000);
	System.out.println("Hero will change outfit");
	Thread.sleep(3000);
	System.out.println("Hero will act in the scene");
	Thread.sleep(3000);
	System.out.println("Hero will do the dubbing");
	Thread.sleep(3000);
	System.out.println("Hero will do the dance with the Heroine");
	Thread.sleep(3000);
	System.out.println("Hero will go the Hotel");
}
catch(Exception e)
		{
	e.printStackTrace();
		}
	}
}
class lightman extends Thread
{
	@Override
	public void run() {
		for(; ;)
		{
			System.out.println("Lightman goes to the set");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class cameraman extends Thread
{
	@Override
	public void run() {
		for(; ;)
		{
			System.out.println("Cameraman goes to the set");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
}
public class Demo1 {

	public static void main(String[] args) {
		Hero h=new Hero();
		h.setName("HERO");
		h.start();
	
		}

}
