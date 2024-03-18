package task_2;

import java.util.concurrent.CopyOnWriteArrayList;

public class Reader implements Runnable{
    private CopyOnWriteArrayList<Integer> listOfNumbers;

    public Reader(CopyOnWriteArrayList<Integer> listOfNumbers){
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run(){
        try {
            while (true) {
                for (Integer number : listOfNumbers) {
                    System.out.println("Reading number:" + number);
                    Thread.sleep(800);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
