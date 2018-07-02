package multithreading;

public class  deadlock {

class A
{
 public synchronized void A1(B b)
 {
	 System.out.println("A1's method");
	 try {Thread.sleep(500);} catch(Exception e) {}
	 System.out.println("A1 trying to call B last method");
	 b.last();
 }
 
 public synchronized void last()
 {
	 System.out.println("A1 last method");
 }
}

class B
{
	public synchronized void B1(A a)
	 {
		 System.out.println("A1's method");
		 try {Thread.sleep(500);} catch(Exception e) {}
		 System.out.println("A1 trying to call B last method");
		 a.last();
	 }
	 
	 public synchronized void last()
	 {
		 System.out.println("A1 last method");
	 }
	
}

class MS extends Thread
{
	A a = new A();
	B b = new B();
	
	public void m1()
	{
		this.start();
		a.A1(b);
		
	}
	
	public void run()
	{
		b.B1(a);
	}
	
}
	public static void main(String[] args) 
	{
		MS d = new MS();
		d.m1();
		
	}

}
