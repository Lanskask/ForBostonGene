package ru.smurtazin.forbostonegene.parallel.ParArrayExperimants.ParallelArray;

/**
 * Created by a1 on 19.03.17.
 */
public class Printer implements Runnable {

    ParallelArray parallelArray;

    Printer(ParallelArray parallelArray) { // throws InterruptedException
        this.parallelArray = parallelArray;
        new Thread(this, "Printer").start();
        /*Thread printThread = new Thread(this, "Printer");
        printThread.start();
        printThread.join();*/

    }

    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        this.parallelArray.print();
    }

}
