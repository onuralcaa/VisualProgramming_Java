package _010_Threads_2;

public class _010_Threads_2 extends Thread {

	
		private String taskName;
		
		public _010_Threads_2(String name)
		{
			this.taskName = name;
		}
		
		public void run() {
		    System.out.println("Task '" + taskName + "' başladı.");
		    try {
		        Thread.sleep(2000);
		    } catch (InterruptedException e) {
		        System.out.println(e);
		    }
		    System.out.println("Task '" + taskName + "' tamamlandı.");
		}

		public static void main(String[] args) {
		    Thread t1 = new Thread(new _010_Threads_2("Task 1"));
		    Thread t2 = new Thread(new _010_Threads_2("Task 2"));
		    Thread t3 = new Thread(new _010_Threads_2("Task 3"));

		    t1.start();
		    t2.start();
		    t3.start();
		}
	

}
