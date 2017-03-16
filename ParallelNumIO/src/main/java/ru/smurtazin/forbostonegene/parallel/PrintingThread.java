package ru.smurtazin.forbostonegene.parallel;

import java.util.ArrayList;

/**
 * Created by a1 on 14.03.17.
 */
public class PrintingThread implements Runnable {

    ArrayList<Integer> numsArray = new ArrayList<Integer>();

    public PrintingThread() {}

    public PrintingThread(ArrayList<Integer> numsArray) {
        this.numsArray = numsArray;
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
//            while (this.numsArray.isEmpty()) {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            synchronized (this.numsArray) {
                if (this.numsArray.isEmpty()) {
                    System.out.println("Array is empty.");
                } else {
                    System.out.println("Min num in array: " + this.getMinInArray());
                    this.numsArray.remove(this.numsArray.indexOf(this.getMinInArray()));
                }
                this.numsArray.notifyAll();
            }
        }
    }
}
