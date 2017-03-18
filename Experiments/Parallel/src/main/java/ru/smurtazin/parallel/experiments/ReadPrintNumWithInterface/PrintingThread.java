package ru.smurtazin.parallel.experiments.ReadPrintNumWithInterface;

import java.util.ArrayList;

/**
 * Created by a1 on 14.03.17.
 */
public class PrintingThread implements Runnable {

    ArrayList<Integer> numsArray = new ArrayList<Integer>();
    Runnable writingThread; // = new WritingThread(numsArray);
    Thread writeTread; // = new Thread(writingThread);

    public PrintingThread() {}

    // used in test
    public PrintingThread(ArrayList<Integer> numsArray) {
        this.numsArray = numsArray;
    }

    public PrintingThread(ArrayList<Integer> numsArray, Runnable writingThread) {
        this.numsArray = numsArray;
        this.writingThread = writingThread;
        this.writeTread = new Thread(writingThread);
    }

    int getMinInArray() {
        int min = this.numsArray.get(0);
        for (int item :
                this.numsArray) {
            if (item < min) min = item;
        }
        return min;
    }

    public void run() {
        System.out.println("in printing thread.");

        while (this.writeTread.isAlive()) { // to stop this thread after stoping WriteingThread
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
//                Thread.currentThread().interrupt();
                ie.printStackTrace();
            }

//            synchronized (this.numsArray) {
                if (this.numsArray.isEmpty()) {
                    System.out.println("Array is empty.");
                } else {
                    System.out.println("Min num in array: " + this.getMinInArray());
                    this.numsArray.remove(this.numsArray.indexOf(this.getMinInArray()));
                }
                this.numsArray.notifyAll();
//            }
        }
    }
}
