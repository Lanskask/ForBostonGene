package ru.smurtazin.forbostonegene.parallel.ParArrayExperimants.ParallelArrayExper;

/**
 * Created by a1 on 17.03.17.
 */
public class Q {

    int n = 0;
    boolean valueSet = false; //

    synchronized int get() {
        while (!this.valueSet) { //
            try { //
                wait(); //
            } catch (InterruptedException ie) { //
                ie.printStackTrace(); //
                System.out.println("InterruptedException is catched"); //
            } //
        } //

        System.out.println("Getted: " + this.n);
        this.valueSet = false; //
        notify(); //
        return this.n;
    }

    synchronized void put(int n) {
        while (this.valueSet) { //
            try { //
                wait(); //
            } catch (InterruptedException ie) { //
                ie.printStackTrace(); //
                System.out.println("InterruptedException is catched"); //
            } //
        } //

        this.n = n;
        this.valueSet = true; //
        System.out.println("Sended: " + this.n);
        notify(); //
    }
}
