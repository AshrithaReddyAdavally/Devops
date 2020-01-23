package threads;
public class Main implements Runnable {
	
		// TODO Auto-generated method stub
public void run()
{
	Thread t=new Thread();
	for(int i=0;i<5;i++)
	{
		System.out.println(i);
		try
		{
		Thread.sleep(500);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
			}
		System.out.println("After sleep");
			}
	System.out.println(Thread.currentThread());
}
public static void main(String[] args) {
	Main m=new Main("child 1");
	Main m1=new Main("child 2");
	
	t.start();
}
	}


