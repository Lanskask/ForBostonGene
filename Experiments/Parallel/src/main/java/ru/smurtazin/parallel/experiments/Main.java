package ru.smurtazin.parallel.experiments;

import ru.smurtazin.parallel.experiments.Mail.GetTheEMail;
import ru.smurtazin.parallel.experiments.Mail.GetTime20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by a1 on 14.03.17.
 */
public class Main {

    ArrayList<Integer> numsInInt = new ArrayList<Integer>();

    Runnable writingThread = new WritingThread(numsInInt);
    Runnable printingThread = new PrintingThread(numsInInt);

    void runApp() throws InterruptedException {
        Thread wrtThread = new Thread(this.writingThread, "WritingThread");
        Thread prThr = new Thread(this.printingThread, "PrintingThread");

        wrtThread.start();
        prThr.start();

        wrtThread.join();
        prThr.join();
    }

    public static void main(String[] args) {
        Main main = new Main();

        try {
            main.runApp();
        } catch (InterruptedException ie) {
            System.out.println(ie.toString());
        }

    }

}
