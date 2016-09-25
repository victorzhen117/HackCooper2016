/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.api;

import java.util.List;
import report.Report;
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
        private ConfigurationBuilder cb;
        private TwitterFactory tf;
        private Twitter twitter;
    public TwitterAPI(){
        cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
        .setOAuthConsumerKey("53nUEtaL8hsyBS7HyCLZsdj5O")
        .setOAuthConsumerSecret("5ZJ8TeXWj7zHOhK1OtvqxmjD0dIrHUjmtZ7rLOYc9cK0ovDcTF")
        .setOAuthAccessToken("576227678-tDF0uPGF3bjCAFgB7CVRcAXCLWSm7pc7dgEzLVea")
        .setOAuthAccessTokenSecret("LKHdmnEhlTPXkgZrI0jYejrOkhtcJTvf7Gz3kIBCeoFu7");
        
        tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();   
    }
    public Report getTweet(Report report, String keyword){  
        
        try{
            Query query = new Query(keyword);
            QueryResult result = twitter.search(query);
            
            for (Status status : result.getTweets()) {
                report.setTweet(status.getText()); 
                report.setTweetID(status.getId());
                report.setUserID(status.getUser().getName());
            }
        }
        catch (TwitterException te){
            te.printStackTrace();
        }
        return report;
    }
}
