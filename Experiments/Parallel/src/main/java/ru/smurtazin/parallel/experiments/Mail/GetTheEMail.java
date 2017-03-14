package ru.smurtazin.parallel.experiments.Mail;

/**
 * Created by a1 on 14.03.17.
 */
public class GetTheEMail implements Runnable {

    private int startTime;

    public GetTheEMail(int startTime) {
        this.startTime = startTime;
    }

    public void run() {
        try {
            Thread.sleep(startTime * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Checking mail...");
    }
}
