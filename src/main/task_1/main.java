package task_1;

import task_1.MyRunable;

public class main {
    public static void main(String[] args) {
        MyRunable myRunnable = new MyRunable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
