//Concurrency relates to an application that is processing more than one task at the same time. 
// Concurrency is creates the illusion of parallelism, however actually the
//chunks of a task aren’t parallelly processed, but inside the application, there are more than one task
//is being processed at a time. It doesn’t fully end one task before it begins ensuing. 

//Parallelism is related to an application where  tasks are divided into smaller sub-tasks that are
//processed seemingly simultaneously or parallel.

 
class myThread1 extends Thread{
	
	@Override
	public void run() {
		int i=0;
		
		while(i<10) {
			System.out.println("Cooking");
			i++;
		}
		
	}
}

class myThread2 extends Thread{
	
	@Override
	public void run() {
		int i=0;
		while(i<10) {
			System.out.println("Texting");
			i++;
		}
		
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
      myThread1 t1 = new myThread1();
      myThread2 t2 = new myThread2();
      t1.start();
      t2.start();
	}

}
