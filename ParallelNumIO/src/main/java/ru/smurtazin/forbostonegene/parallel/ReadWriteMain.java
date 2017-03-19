package ru.smurtazin.forbostonegene.parallel;

import java.util.ArrayList;

/**
 * Created by a1 on 14.03.17.
 */
public class ReadWriteMain {

    ArrayList<Integer> numsInInt = new ArrayList<Integer>();

    ReadingThread readingThread = new ReadingThread(numsInInt);
    PrintingThread printingThread = new PrintingThread(numsInInt);

    void runApp() throws InterruptedException {
        Thread wrtThread = new Thread(this.readingThread, "WritingThread");
        Thread prThr = new Thread(this.printingThread, "PrintingThread");

        wrtThread.start();
        prThr.start();

        wrtThread.join();
        prThr.join();
    }

    public static void main(String[] args) {
        ReadWriteMain main = new ReadWriteMain();

        try {
            main.runApp();
        } catch (InterruptedException ie) {
            System.out.println(ie.toString());
        }
    }

}
