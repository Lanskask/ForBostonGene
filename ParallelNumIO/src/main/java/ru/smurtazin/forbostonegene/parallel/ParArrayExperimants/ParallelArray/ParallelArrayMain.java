package ru.smurtazin.forbostonegene.parallel.ParArrayExperimants.ParallelArray;

/**
 * Created by a1 on 19.03.17.
 */
public class ParallelArrayMain {

    ParallelArray parallelArray = new ParallelArray();

    public void runApp() {
        new Reader(this.parallelArray);
        new Printer(this.parallelArray);
    }

    public static void main(String[] args) {
        ParallelArrayMain main = new ParallelArrayMain();

        main.runApp();
    }
}
