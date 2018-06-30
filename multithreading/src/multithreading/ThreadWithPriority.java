package multithreading;

public class ThreadWithPriority {

	//public static void main(String[] args) {
		public static void main(String[] args) throws Exception {
			
			Thread t1 = new Thread(() ->
			{
				for(int i = 0; i<5;i++)
				{
					System.out.println("triveni" + " " + Thread.currentThread().getPriority());
					try{Thread.sleep(100);} catch(Exception e) {}
				}
			});
			
			
			Thread t2 = new Thread(() ->
			{
				for(int i = 0; i<5;i++)
				{
					System.out.println("naik");
					try{Thread.sleep(100);} catch(Exception e) {}
				}
			});
			
			System.out.println(t1.getName());
			t2.setName("Thread Priority");
			System.out.println(t2.getName());
			
			System.out.println(t1.getPriority());
			t2.setPriority(Thread.MAX_PRIORITY);
			System.out.println(t2.getPriority());
			
			t1.start();
			try{Thread.sleep(10);} catch(Exception e) {}
			t2.start();
	         
			System.out.println(t1.isAlive());
			
			t1.join();
			t2.join();
			
			System.out.println(t1.isAlive());
			System.out.println("byee");
		}

	}

//}
