package ru.smurtazin.forbostonegene.parallel;

import java.util.ArrayList;

/**
 * Created by a1 on 16.03.17.
 */
public class PrintingThread implements Runnable {

    ArrayList<Integer> numsArray = new ArrayList<Integer>();

    public PrintingThread(ArrayList<Integer> numsArray) {
        this.numsArray = numsArray;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

            if (this.numsArray.isEmpty()) {
                System.out.println("Array is empty.");
            } else {
                System.out.println("Min num in array: " + this.getMinInArray());
                this.numsArray.remove(this.numsArray.indexOf(this.getMinInArray()));
            }
        }
    }

    void printFunction() {
        System.out.println("Printing Thread");
    }

    int getMinInArray() {
        int min = this.numsArray.get(0);
        for (int item :
                this.numsArray) {
            if (item < min) min = item;
        }
        return min;
    }

}