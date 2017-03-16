package ru.smurtazin.parallel.experiments.OneSevenArray;

import java.util.ArrayList;

/**
 * Created by a1 on 16.03.17.
 */
class Writer implements Runnable {

    public static ArrayList<Integer> array = new ArrayList<Integer>();
    final int value;

    Writer (int val) {
        this.value = val;
    }

    public void run() {
        for (int i = 0; i < array.size(); i++) {
            synchronized (array) {
                try {
                    //Algorithm?
                    array.set(i, value);

                    array.notifyAll();
                    if (i < array.size()-1)
                        array.wait();
                } catch (InterruptedException ie) {
                    System.err.println(ie.getMessage());
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+" terminated.");
    }
}