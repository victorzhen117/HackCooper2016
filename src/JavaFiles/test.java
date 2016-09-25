/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;
import java.io.IOException;
import java.util.ArrayList;
import static JavaFiles.JsonSave.saveData;

/**
 *
 * @author Garry
 */
public class test {
    public static void main(String[] args){
        TwitterAPI twitterAPI = new TwitterAPI();
        ArrayList<Report> aReport= new ArrayList();
        Report report1 = new Report();
        Report report2 = new Report();
        aReport.add(report1);
        aReport.add(report2);
        User user = new User();
        
        
        report1.incrementScore();
        report1.incrementScore();
        report1.incrementTimesChecked();
        report1 = twitterAPI.getTweet(report1, "slut");
        report2 = twitterAPI.getTweet(report2, "harambe");
        user.setUser(report1.getUserID());
        try{
            saveData(aReport, user);
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
        System.out.println("Score: " + report1.getScore());
        System.out.println("Times checked: " +report1.getTimesChecked());
        System.out.println("Tweet: "+report1.getTweet());
        System.out.println("User: "+report1.getUserID());
        System.out.println("Tweet ID: "+report1.getTweetID());
        
    }
}
