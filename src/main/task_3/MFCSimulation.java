package task_3;
import java.util.Random;
public class MFCSimulation {
    public static void simulateClients(MFCWindow window, int numClients, String category) {
        Random random = new Random();
        int left = 0;

        for (int i = 0; i < numClients; i++) {
            try {
                window.processClient(category);
            } catch (InterruptedException e) {
                left++;
            }

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        double percentLeft = ((double) left / numClients) * 100;
        System.out.println("Процент ушедших " + category + " клиентов из " + window.getName() + ": " + percentLeft + "%");
    }
}
