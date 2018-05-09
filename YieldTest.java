
public class YieldTest extends Thread{
	@Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldTest runn = new YieldTest();
        new Thread(runn, "No.1 Thread").start();
        new Thread(runn, "No.2 Thread").start();
    }
}
