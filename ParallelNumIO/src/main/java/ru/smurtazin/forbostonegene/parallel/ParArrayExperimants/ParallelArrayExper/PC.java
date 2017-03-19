package ru.smurtazin.forbostonegene.parallel.ParArrayExperimants.ParallelArrayExper;

/**
 * Created by a1 on 17.03.17.
 */
public class PC {

    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);

        System.out.println("To stop press Ctrl+C");
    }


}
