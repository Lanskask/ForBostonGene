package ru.smurtazin.forbostonegene.parallel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by a1 on 16.03.17.
 */
public class ReadingThread implements Runnable {

    ArrayList<Integer> numsInInt = new ArrayList<Integer>();

    Scanner in = new Scanner(System.in);

    public ReadingThread(ArrayList<Integer> numsInInt) {
        this.numsInInt = numsInInt;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(0); // how to do it with out sleep
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            this.takeNum();
        }
    }

    /**
     *
     * @return String num from Scanner in
     */
    public String takeNum() {
        System.out.println("Write your number: ");
        String nextNum = this.in.nextLine();

        this.numsInInt.add(this.wordToNum(nextNum));

        return nextNum;
    }

    void printFunction() {
        System.out.println("Reading Thread");
    }

    /**
     *
     * @param word
     * @return int num
     */
    public int wordToNum(String word) {
        int num = 0;

        if(word.equalsIgnoreCase("one")) num = 1;
        if(word.equalsIgnoreCase("two")) num = 2;
        if(word.equalsIgnoreCase("three")) num = 3;
        if(word.equalsIgnoreCase("four")) num = 4;
        if(word.equalsIgnoreCase("five")) num = 5;
        if(word.equalsIgnoreCase("six")) num = 6;
        if(word.equalsIgnoreCase("seven")) num = 7;
        if(word.equalsIgnoreCase("eight")) num = 8;
        if(word.equalsIgnoreCase("nine")) num = 9;

        if(word.equalsIgnoreCase("ten")) num = 10;
        if(word.equalsIgnoreCase("eleven")) num = 11;
        if(word.equalsIgnoreCase("twelve")) num = 12;
        if(word.equalsIgnoreCase("thirteen")) num = 13;
        if(word.equalsIgnoreCase("fourteen")) num = 14;
        if(word.equalsIgnoreCase("fifteen")) num = 15;
        if(word.equalsIgnoreCase("sixteen")) num = 16;
        if(word.equalsIgnoreCase("seventeen")) num = 17;
        if(word.equalsIgnoreCase("eighteen")) num = 18;
        if(word.equalsIgnoreCase("nineteen")) num = 19;

        if(word.equalsIgnoreCase("twenty")) num = 20;
        if(word.equalsIgnoreCase("thirty")) num = 30;
        if(word.equalsIgnoreCase("forty")) num = 40;
        if(word.equalsIgnoreCase("fifty")) num = 50;
        if(word.equalsIgnoreCase("sixty"))num = 60;
        if(word.equalsIgnoreCase("seventy"))num = 70;
        if(word.equalsIgnoreCase("eighty")) num = 80;
        if(word.equalsIgnoreCase("ninety")) num = 90;
        if(word.equalsIgnoreCase("hundred")) num = 100;
        if(word.equalsIgnoreCase("thousand")) num = 1000;

        return num;
    }

    /**
     * Taken from https://stackoverflow.com/questions/4062022/how-to-convert-words-to-a-number
     * Only till thousands
     */
    public int inNumerals(String inWords) {
        int wordNum = 0;
        String[] arrInWords = inWords.split(" ");
        int arrInWordsLength = arrInWords.length;

        if(inWords.equals("zero")) return 0;

        if(inWords.contains("thousand")) {
            int indexOfThousand = inWords.indexOf("thousand");
            String beforeThousand = inWords.substring(0,indexOfThousand);
            String[] arrBeforeThousand = beforeThousand.split(" ");
            int arrBeforeThousandLength = arrBeforeThousand.length;

            if(arrBeforeThousandLength==2) {
                wordNum = wordNum + 1000*(wordToNum(arrBeforeThousand[0]) + wordToNum(arrBeforeThousand[1]));
            }

            if(arrBeforeThousandLength==1) {
                wordNum = wordNum + 1000*(wordToNum(arrBeforeThousand[0]));
            }
        }

        if( inWords.contains("hundred")) {
            int indexOfHundred = inWords.indexOf("hundred");
            String beforeHundred = inWords.substring(0,indexOfHundred);
            String[] arrBeforeHundred = beforeHundred.split(" ");
            int arrBeforeHundredLength = arrBeforeHundred.length;
            wordNum = wordNum + 100*(wordToNum(arrBeforeHundred[arrBeforeHundredLength-1]));
            String afterHundred = inWords.substring(indexOfHundred+8); //7 for 7 char of hundred and 1 space

            String[] arrAfterHundred = afterHundred.split(" ");
            int arrAfterHundredLength = arrAfterHundred.length;

            if(arrAfterHundredLength==1) {
                wordNum = wordNum + (wordToNum(arrAfterHundred[0]));
            }

            if(arrAfterHundredLength==2) {
                wordNum = wordNum + (wordToNum(arrAfterHundred[1]) + wordToNum(arrAfterHundred[0]));
            }
        }

        if( !inWords.contains("thousand") && !inWords.contains("hundred")) {
            if(arrInWordsLength==1) {
                wordNum = wordNum + (wordToNum(arrInWords[0]));
            }

            if(arrInWordsLength==2) {
                wordNum = wordNum + (wordToNum(arrInWords[1]) + wordToNum(arrInWords[0]));
            }
        }
        return wordNum;
    }

}
