package JavaThreads;

class TPriority extends Thread {
	public void run() {
		System.out.println(
				"Thread Name : " + Thread.currentThread().getPriority() + " Thread Priority : " + Thread.currentThread().getPriority()
		);
	}
}
public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setPriority(8);
		System.out.println("Main Thread : " + Thread.currentThread().getPriority());
		
		TPriority t1 = new TPriority();
		TPriority t2 = new TPriority();
		TPriority t3 = new TPriority();
		t1.start();
		t1.join();
		System.out.print(t1.getState());
		
		t2.start();
		t2.join();
		System.out.print(t1.getState());
		t1.start();
		
	}

}
