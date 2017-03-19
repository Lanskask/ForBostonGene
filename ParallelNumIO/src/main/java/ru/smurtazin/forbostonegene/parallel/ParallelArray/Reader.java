package ru.smurtazin.forbostonegene.parallel.ParallelArray;

/**
 * Created by a1 on 19.03.17.
 */
public class Reader implements Runnable {

    ParallelArray parallelArray;

    Reader(ParallelArray parallelArray) {
        this.parallelArray = parallelArray;
        new Thread(this, "Reader").start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(0); // TODO do it with out sleep
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            this.parallelArray.read();
        }
    }

}
