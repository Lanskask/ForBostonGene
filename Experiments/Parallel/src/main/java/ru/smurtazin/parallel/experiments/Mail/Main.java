package ru.smurtazin.parallel.experiments.Mail;

/**
 * Created by a1 on 14.03.17.
 */
public class Main {
    Runnable getTime  = new GetTime20();
    Runnable getMail = new GetTheEMail(3);
//    Runnable getMailAgain = new GetTheEMail(3);

    void runApp() {
        new Thread(this.getTime).start();
        new Thread(this.getMail).start();
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.runApp();
    }

}
