package ru.smurtazin.forbostonegene.twiitter4j;

import twitter4j.DirectMessage;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.Scanner;

/**
 * Created by a1 on 16.03.17.
 * Based on https://github.com/yusuke/twitter4j/blob/master/twitter4j-examples/src/main/java/twitter4j/examples/directmessage/SendDirectMessage.java
 */
public class TwitterSenderApp {

    Scanner sc = new Scanner(System.in);
    String answer;
    String getterNickname;
    String text;

    void getAnswers() {
            System.out.println("Print nickname of twitter user: "); // whom you want to send message to
            answer = sc.nextLine();
            this.getterNickname = answer;

            System.out.println("Print a text you want to send (in quotes): ");
            answer = sc.nextLine();
            this.text = answer;
    }

    void sendMessage() {
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            DirectMessage message = twitter.sendDirectMessage(getterNickname, text);
            System.out.println("Direct message successfully sent to " + message.getRecipientScreenName());
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to send a direct message: " + te.getMessage());
            System.exit(-1);
        }
    }

    void runApp() {
        this.getAnswers();
        this.sendMessage();
    }

    public static void main(String[] args) {
        TwitterSenderApp twitterSenderApp = new TwitterSenderApp();

        twitterSenderApp.runApp();
    }
}
