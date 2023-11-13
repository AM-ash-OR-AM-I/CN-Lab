import java.util.Scanner;

class MyThread extends Thread {
  public int value;

  MyThread(int value) {
    this.value = value;
  }

  public void run() {
    for (int i = 0; i < 100; i++)
      System.out.printf("Thread is running %d\n", i);
  }
}

class MyRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++)
      System.out.println("Runnable is running");
  }
}

class Worker extends Thread {
  public int a, b;

  Worker(int a, int b) {
    this.a = a;
    this.b = b;
  }

  int getValueA() {
    return a;
  }

  public void run() {
    try {
      System.out.println("Worker thread is running");
      System.out.println("Calculating...");
      Thread.sleep(1000); // 1000 ms used to simulate a long running task
      System.out.printf("Results is %d", a + b);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class Threads {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      Thread w = new Worker(a, b);
      w.start();
      // Thread t1 = new MyThread();
      // Thread t2 = new MyThread();
      Thread r = new Thread(new MyRunnable());
      // t1.start();
      // t2.start();
    }
  }
}