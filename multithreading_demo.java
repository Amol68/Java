//Concurrency relates to an application that is processing more than one task at the same time. 
// Concurrency is creates the illusion of parallelism, however actually the
//chunks of a task aren’t parallelly processed, but inside the application, there are more than one task
//is being processed at a time. It doesn’t fully end one task before it begins ensuing. 

//Parallelism is related to an application where  tasks are divided into smaller sub-tasks that are
//processed seemingly simultaneously or parallel.

 class thread1 extends Thread {
	
	public void run()
	{
		while(true)
		{
		System.out.println("Thread 1 is running");
		}
		
	}
	
}
 
 class thread2 extends Thread {
		
	public void run()
	{
		while(true)
		{
		System.out.println("Thread 2 is running");
		}
		
	}
	
}
 




public class multi_threading {

	public static void main(String[] args) 
	{
       thread1 t1 = new thread1();
       thread2 t2 = new thread2();
       t1.start();
       t2.start();
       
	}

}
