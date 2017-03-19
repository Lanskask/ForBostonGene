package ru.smurtazin.forbostonegene.twiitter4j;

import twitter4j.*;
import twitter4j.auth.AccessToken;

/**
 * Created by a1 on 16.03.17.
 */
public class GetUserStatus {

    public static void main(String[] args) {

        String consumerKey = "fZgaB2YBXluTUy0v7zKIZkTAc";
        String consumerSecret = "gip8hYe8Cxb8OU7CyKPMr8c1UJONkg8AHsFUzzLKD9j7JcpXG9";

        String accessToken = "841975844859965440-7NmYjrn1P85zcC6BWH3DY19qLfcXy30";
        String accessTokenSecret = "6v0VX5aBsXPUWUN2HI2lfEn90HrhOWsY8sK81spjIAvRL";

        Twitter twitter = new TwitterFactory().getInstance();

        twitter.setOAuthConsumer(consumerKey , consumerSecret);
        twitter.setOAuthAccessToken(
                new AccessToken(accessToken, accessTokenSecret)
        );

        try {
            System.out.println("Here should be user status: ");
            ResponseList<Status> a = twitter.getUserTimeline(
                    new Paging(1, 5)
            );

            System.out.println("End of user statuses.");

            for(Status b: a ) {
                System.out.println(b.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
