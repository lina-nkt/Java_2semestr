package task_3;

public class MFCWindow {
    private String name;
    private boolean busy;

    public MFCWindow(String name) {
        this.name = name;
        this.busy = false;
    }

    public synchronized void processClient(String category) throws InterruptedException {
        while (busy) {
            wait();
        }

        busy = true;
        System.out.println("Клиент из категории " + category + " обслуживается в " + name);
        Thread.sleep(500); // Имитация времени обслуживания
        busy = false;
    }

    public String getName() {
        return name;
    }
}