package ru.smurtazin.parallel.experiments;

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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

//        System.out.println("Pr theread Log 1");

        if (this.numsArray.isEmpty()) System.out.println("Array is empty.");
        else System.out.println("Min num in array: " + this.getMinInArray());

    }
}
