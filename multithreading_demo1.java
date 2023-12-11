
class ThreadDemod1 implements Runnable{
	
	public void run() {
		System.out.println("I am Thread1");
		System.out.println("I am Thread1");
		System.out.println("I am Thread1");
		System.out.println("I am Thread1");
		System.out.println("I am Thread1");
		System.out.println("I am Thread1");
		System.out.println("I am Thread1");
		System.out.println("I am Thread1");
		System.out.println("I am Thread1");
		
	}
}

class ThreadDemod2 implements Runnable{
	
	public void run() {
		System.out.println("Thread2");
		System.out.println("Thread2");
		System.out.println("Thread2");
		System.out.println("Thread2");
		System.out.println("Thread2");
		System.out.println("Thread2");
		System.out.println("Thread2");
		System.out.println("Thread2");
	}
}

public class ThreadDemo1  {

	public static void main(String[] args) {
		
		ThreadDemod1 bullet1 = new ThreadDemod1();
		Thread gun1 = new Thread(bullet1);
		
		ThreadDemod2 bullet2 = new ThreadDemod2();
		Thread gun2 = new Thread(bullet2);	
		
		gun1.start();
		gun2.start();
		
}

}
