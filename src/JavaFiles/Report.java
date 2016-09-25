/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;

import twitter4j.User;

/**
 *
 * @author Garry
 */
public class Report {
    private int score;
    private int timesChecked;
    private String tweet;
    private String userID;
    private long tweetID;
    private TwitterAPI twitterAPI;
    
    public Report(){
        score = 0;
        timesChecked = 0;
        tweet = "";
        tweetID = 0;
        twitterAPI = new TwitterAPI();
    }
    public void setTweet(String tweet){
        this.tweet = tweet;
    }
    public void setUserID(String userID){
        this.userID = userID;
    }
    public void setTweetID(long tweetID){
        this.tweetID = tweetID;
    }
    public String getTweet(){
        return tweet;
    }
    public String getUserID(){
        return userID;
    }
    public long getTweetID(){
        return tweetID;
    }
    public void incrementScore(){
        score = score +1;
    }
    
    public void incrementTimesChecked(){
        this.timesChecked += 1;
    }
    
    public int getScore(){
        return score;
    }
    
    public int getTimesChecked(){
        return timesChecked;
    }
    
}
