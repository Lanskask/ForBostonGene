package ru.smurtazin.forbostonegene.parallel.ParArrayExperimants.ParallelArrayExper;

/**
 * Created by a1 on 17.03.17.
 */
public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}
