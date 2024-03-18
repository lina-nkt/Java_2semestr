package task_3;


import static task_3.MFCSimulation.simulateClients;

public class Main {
    public static void main(String[] args) {
        int n_young = 10;
        int n_old = 15;
        int n_business = 5;

        MFCWindow window1 = new MFCWindow("Окно 1");
        MFCWindow window2 = new MFCWindow("Окно 2");
        MFCWindow window3 = new MFCWindow("Окно 3");

        Thread t1 = new Thread(() -> simulateClients(window1, n_young, "Молодые"));
        Thread t2 = new Thread(() -> simulateClients(window2, n_old, "Пожилые"));
        Thread t3 = new Thread(() -> simulateClients(window3, n_business, "Бизнесмены"));

        t1.start();
        t2.start();
        t3.start();
    }
}
