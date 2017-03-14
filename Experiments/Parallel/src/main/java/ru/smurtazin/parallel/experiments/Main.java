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
    ArrayList<String> numsArray = new ArrayList<String>();

    ArrayList<String> numsInString;
    ArrayList<Integer> numsInInt;

    // Need for tests with Main
//    ArrayList<String> numsInString = new ArrayList<String>(Arrays.asList("one", "two", "three"));

        WritingThread writingThread = new WritingThread();
//    WritingThread writingThread = new WritingThread(numsInString); // Need for tests with Main
    PrintingThread printingThread = new PrintingThread();

    void printAllIntArray() {
        for (int item : this.writingThread.numsInInt ) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    void printAllStringArray() {
        for (String item : this.writingThread.numsInString ) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    void runApp() {
        Runnable writingThread = new WritingThread();
        Runnable printingThread = new PrintingThread();

        new Thread(writingThread, "WritingThread").start();
        new Thread(printingThread, "PrintingThread").start();
    }

    public static void main2(String[] args) {
        Main main = new Main();

        main.runApp();

        /*new Thread(main.writingThread).start();
        new Thread(main.printingThread).start();*/

/*        main.writingThread.takeNum();
        main.writingThread.takeNum();
        main.writingThread.takeNum();

        main.printAllStringArray();
        main.printAllIntArray();*/
    }

    Scanner in = new Scanner(System.in);

    public String takeNum() {
        System.out.println("Write your number: ");
        String nextNum = this.in.nextLine();

//        this.numsInString.add(nextNum);
//        this.numsInInt.add(this.wordToNum(nextNum));
        return nextNum;
    }

    void runApp2() {
        //        Scanner in = new Scanner(System.in);
        String answer = "";

        while (!answer.equalsIgnoreCase("q")) {
            System.out.println("Print q to exit");
//            answer = in.nextLine();
            answer = this.takeNum();
            System.out.println("Answer: " + answer);
        }
    }

    void runApp3() {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("one", "two", "three"));
        WritingThread writingThread = new WritingThread(arrayList);
    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.runApp2();
        main.runApp3();
    }

}
