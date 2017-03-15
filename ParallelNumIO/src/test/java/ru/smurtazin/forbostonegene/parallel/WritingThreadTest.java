package ru.smurtazin.forbostonegene.parallel;

import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by a1 on 14.03.17.
 */
public class WritingThreadTest {

    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(5, 3, 8, 1)); // need for takeNum test
    WritingThread writingThread = new WritingThread(arrayList);

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
        this.writingThread.takeNum();
        System.setIn(in);


        this.printAllStringArray();
        this.printAllIntArray();
    }

    @Test
    public void inNumerals() throws Exception {
        String toNums = "nine thousand nine hundred ninety nine";

        assertThat(this.writingThread.inNumerals(toNums), is(9999));
    }

}