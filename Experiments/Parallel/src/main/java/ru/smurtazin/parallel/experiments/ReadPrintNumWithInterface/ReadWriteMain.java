package ru.smurtazin.parallel.experiments.ReadPrintNumWithInterface;

import java.util.ArrayList;

/**
 * Created by a1 on 14.03.17.
 */
public class ReadWriteMain {

    ArrayList<Integer> numsInInt = new ArrayList<Integer>();

    Runnable writingThread = new WritingThread(numsInInt);
    Runnable printingThread = new PrintingThread(numsInInt, writingThread);

    void runApp() throws InterruptedException {
        Thread wrtThread = new Thread(this.writingThread, "WritingThread");
        Thread prThr = new Thread(this.printingThread, "PrintingThread");

        prThr.start();
        wrtThread.start();

        wrtThread.join();
        prThr.join();
    }

    public static void main(String[] args) {
        ReadWriteMain main = new ReadWriteMain();

        try {
            main.runApp();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}