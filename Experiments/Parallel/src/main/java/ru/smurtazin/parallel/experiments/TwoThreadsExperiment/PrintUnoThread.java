package ru.smurtazin.parallel.experiments.TwoThreadsExperiment;

/**
 * Created by a1 on 16.03.17.
 */
public class PrintUnoThread implements Runnable {

    void printFunction() {
        System.out.println("Print 1");
    }

    public void run() {
        try {
            Thread.sleep(1000);
            /*Thread.wait();
            Thread.not*/
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        this.printFunction();
    }
}
