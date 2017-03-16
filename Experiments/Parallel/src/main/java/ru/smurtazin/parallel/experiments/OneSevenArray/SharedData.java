package ru.smurtazin.parallel.experiments.OneSevenArray;

import java.util.ArrayList;

/**
 * Created by a1 on 16.03.17.
 */
class SharedData {

    ArrayList<Integer> data = new ArrayList<Integer>(10);

    void runApp() throws InterruptedException {
        for (int i = 0; i < 10; i++)
            this.data.add(0);

        Writer.array = this.data;

        Thread one = new Thread (new Writer(1), "Ones");
        Thread seven = new Thread (new Writer(7), "Sevens");

        one.start();
        seven.start();

        one.join();
        seven.join();

        this.printArray();
    }

    void printArray() {
        for (Integer item : this.data) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {

        SharedData sharedData = new SharedData();

        sharedData.runApp();
    }
}