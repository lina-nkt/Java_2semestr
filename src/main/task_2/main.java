package task_2;

import task_1.MyRunable;

import java.util.concurrent.CopyOnWriteArrayList;

public class main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> listOfNumbers = new CopyOnWriteArrayList<>();

        Reader reader = new Reader(listOfNumbers);
        Writer writer = new Writer(listOfNumbers);

        Thread readerThread = new Thread(reader);
        Thread writerThread = new Thread(writer);

        writerThread.start();
        readerThread.start();
    }
}
