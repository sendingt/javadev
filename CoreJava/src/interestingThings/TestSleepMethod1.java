package interestingThings;

public class TestSleepMethod1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t1:" + t2.getName());
		System.out.println("id of t1:" + t1.getId());
		System.out.println("id of t2:" + t2.getId());
		t1.start();
		try {
			t1.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// t1.start();
		// t1.start();

		t2.start();
		t1.setName("ThreadsConcept");
		System.out.println("After changing name of t1:" + t1.getName());

	}
}