package ru.smurtazin.parallel.experiments;

import org.junit.Test;
import ru.smurtazin.parallel.experiments.Mail.GetTime20;

/**
 * Created by a1 on 14.03.17.
 */
public class GetTime20Test {

    GetTime20 getTime20;
    Runnable getTime = new GetTime20();

    @Test
    public void run() throws Exception {
        new Thread(this.getTime).start();
    }

}