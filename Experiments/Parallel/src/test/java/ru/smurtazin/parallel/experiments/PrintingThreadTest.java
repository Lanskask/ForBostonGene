package ru.smurtazin.parallel.experiments;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 14.03.17.
 */
public class PrintingThreadTest {

    ArrayList<Integer> numsInInt = new ArrayList<Integer>(Arrays.asList(4, 3, 7, 1));
    PrintingThread printingThread = new PrintingThread(numsInInt);

    @Test
    public void getMinInArray() throws Exception {
        assertThat(this.printingThread.getMinInArray(), is(1));
    }

}