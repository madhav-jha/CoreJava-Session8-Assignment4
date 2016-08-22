package session8.assignment4;

public class TestDemoThreadCount {

	public static void main(String[] args) {

		System.out.println("Main thread created :" + Thread.currentThread().getName() + " , "
				+ Thread.currentThread().getPriority());

		DemoThreadCount t = new DemoThreadCount();

		t.start();

		while (t.isAlive()) {
			System.out.println("Main thread will be alive till the child thread is live");
		}

		System.out.println("Main thread is over");
	}

}
