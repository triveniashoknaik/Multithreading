package multithreading;

class Hi1 implements Runnable
{
public void run()
{
	for(int i = 0; i<5;i++)
	{
		System.out.println("triveni");
		try{Thread.sleep(100);}catch(Exception e) {}
	}
}
}

class Hello1 implements Runnable
{
	public void run()
	{
		for(int i = 0; i<5;i++)
		{
			System.out.println("naik");
			try{Thread.sleep(100);}catch(Exception e) {}
		}
}
}

public class ThreadwithRunnableInterface {

	public static void main(String[] args) {
	Hi1 obj1 = new Hi1();
	Hello1 obj2 = new Hello1();
	
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	
	t1.start();
	try{Thread.sleep(10);}catch(Exception e) {}
	t2.start();

	}

}
