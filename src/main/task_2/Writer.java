package task_2;

import java.util.concurrent.CopyOnWriteArrayList;

public class Writer implements Runnable{
    private CopyOnWriteArrayList<Integer> listOfNumbers;

    public Writer(CopyOnWriteArrayList<Integer> listOfNumbers){
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run(){
        try{
            while (true) {
                for (int i = 1; i <= 15; i++) {
                    listOfNumbers.add(i);
                    System.out.println("Writing number:" + i);
                    Thread.sleep(700);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
