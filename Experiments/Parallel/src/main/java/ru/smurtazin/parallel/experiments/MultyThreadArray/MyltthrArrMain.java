package ru.smurtazin.parallel.experiments.MultyThreadArray;

import java.util.Scanner;

/**
 * Created by a1 on 15.03.17.
 */
public class MyltthrArrMain {

    MultythrArray multythrArray = new MultythrArray();

    void runApp() {
        Thread wrtThread = new Thread (new WritingThread(this.multythrArray), "Writing");
        Thread prtThread = new Thread (new PrintingThread(this.multythrArray), "Printing");

        wrtThread.start();
        prtThread.start();

        /*wrtThread.join();
        prtThread.join();*/
    }

    public static void main(String[] args) {
        MyltthrArrMain main = new MyltthrArrMain();

        main.runApp();
    }

    private static final class WritingThread implements Runnable {
        private final MultythrArray thrArray;
        Scanner in = new Scanner(System.in);

        public WritingThread(final MultythrArray thrArray) {
            super();
            this.thrArray = thrArray;
        }

        public void run() {
            String answer = "";

            while (!answer.equalsIgnoreCase("q")) {
                System.out.println("Print q to exit");
                answer = this.in.nextLine();

                thrArray.push();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private static final class PrintingThread  implements Runnable { // extends Thread
        private final MultythrArray thrArray;
//        Scanner in = new Scanner(System.in);

        public PrintingThread(final MultythrArray thrArray) {
            super();
            this.thrArray = thrArray;
        }

        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            this.thrArray.poll();
        }
    }

}
