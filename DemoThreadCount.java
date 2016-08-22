package session8.assignment4;

public class DemoThreadCount extends Thread {

	@Override
	public void run() {

		System.out.println("My thread created " + Thread.currentThread().getPriority());

		for (int i = 1; i <= 10; i++)
			System.out.println("count: " + i);

		System.out.println("My thread is over");
	}

}
