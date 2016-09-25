/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import report.Report;
import twitter.api.TwitterAPI;

/**
 *
 * @author Garry
 */
public class test {
    public static void main(String[] args){
        TwitterAPI twitterAPI = new TwitterAPI();
        Report report = new Report();
    report.incrementScore();
        report.incrementScore();
        report.incrementTimesChecked();
        report = twitterAPI.getTweet(report, "slut");
        
        System.out.println("Score: " + report.getScore());
        System.out.println("Times checked: " +report.getTimesChecked());
        System.out.println("Tweet: "+report.getTweet());
        System.out.println("User: "+report.getUserID());
        System.out.println("Tweet ID: "+report.getTweetID());
        
    }
}
