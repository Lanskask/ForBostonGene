package ru.smurtazin.parallel.experiments.Mail;

//import ja

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by a1 on 14.03.17.
 */
public class GetTime20 implements Runnable {

    public void run() {
        Date rightNow;
        Locale currentLocale;
        DateFormat timeFormater;
        DateFormat dateFormater;
        String timeOutput;
        String dateOutput;

        for (int i = 0; i < 20; i++) {
            rightNow = new Date();
            currentLocale = new Locale("ru");

            timeFormater = DateFormat.getTimeInstance(
                    DateFormat.DEFAULT, currentLocale);
            dateFormater = DateFormat.getDateInstance(
                    DateFormat.DEFAULT, currentLocale);

            timeOutput = timeFormater.format(rightNow);
            dateOutput = dateFormater.format(rightNow);

            System.out.println(timeOutput + " " + dateOutput);
            System.out.println();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

        }
    }

}
