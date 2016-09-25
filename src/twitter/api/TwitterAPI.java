/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.api;

import java.util.List;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Garry
 */
public class TwitterAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getTweet());
    }
    public static String getTweet(){
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
        .setOAuthConsumerKey("53nUEtaL8hsyBS7HyCLZsdj5O")
        .setOAuthConsumerSecret("5ZJ8TeXWj7zHOhK1OtvqxmjD0dIrHUjmtZ7rLOYc9cK0ovDcTF")
        .setOAuthAccessToken("576227678-tDF0uPGF3bjCAFgB7CVRcAXCLWSm7pc7dgEzLVea")
        .setOAuthAccessTokenSecret("LKHdmnEhlTPXkgZrI0jYejrOkhtcJTvf7Gz3kIBCeoFu7");

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();   
        String tweet = "";
        try{
            Query query = new Query("slut");
            QueryResult result = twitter.search(query);
            for (Status status : result.getTweets()) {
                tweet = status.getText() + " " + status.getCreatedAt().toString();
            }
        }
        catch (TwitterException te){
            te.printStackTrace();
        }
        return tweet;
    }
}
