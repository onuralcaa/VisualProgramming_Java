package _009_Threads;


public class Threads extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " değeri " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Threads t1 = new Threads();
        Threads t2 = new Threads();
        t1.start();
        t2.start();
    }
}
