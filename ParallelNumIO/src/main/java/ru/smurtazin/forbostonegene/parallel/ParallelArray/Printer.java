package ru.smurtazin.forbostonegene.parallel.ParallelArray;

import ru.smurtazin.forbostonegene.parallel.ParallelArrayExper.Q;

/**
 * Created by a1 on 19.03.17.
 */
public class Printer implements Runnable {

    ParallelArray parallelArray;

    Printer(ParallelArray parallelArray) {
        this.parallelArray = parallelArray;
        new Thread(this, "Printer").start();
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
