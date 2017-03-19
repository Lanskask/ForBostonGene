package ru.smurtazin.forbostonegene.parallel.ParallelArray;

/**
 * Created by a1 on 19.03.17.
 */
public class ParallelArrayMain {

    void runApp() {
        ParallelArray parallelArray = new ParallelArray();

        new Reader(parallelArray);
        new Printer(parallelArray);

        System.out.println("To stop press Ctrl+C");
    }

    public static void main(String[] args) {
        ParallelArrayMain main = new ParallelArrayMain();

        main.runApp();
    }


}
