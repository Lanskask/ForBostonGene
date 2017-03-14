package ru.smurtazin.parallel.experiments;

import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 14.03.17.
 */
public class WritingThreadTest {

    WritingThread writingThread = new WritingThread();

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

    @Ignore // how to test user input
    @Test
    public void takeNum() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("one".getBytes());
//        System.setIn(new ByteArrayInputStream("one".getBytes()));
        this.writingThread.takeNum();
        System.setIn(in);

        /*System.setIn(new ByteArrayInputStream("two".getBytes()));
        this.writingThread.takeNum();

        System.setIn(new ByteArrayInputStream("three".getBytes()));
        this.writingThread.takeNum();*/

        this.printAllStringArray();
        this.printAllIntArray();
    }

    @Test
    public void inNumerals() throws Exception {
        String toNums = "nine thousand nine hundred ninety nine";

        assertThat(this.writingThread.inNumerals(toNums), is(9999));
    }

}