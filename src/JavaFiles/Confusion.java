/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;

import static JavaFiles.JsonSave.loadData;
import static JavaFiles.JsonSave.saveData;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Garry
 */
public class Confusion {
    public static void main(String[] args) throws IOException{
        ArrayList<Report> report = new ArrayList<>();
        ArrayList<User> user = new ArrayList<>();
        TwitterAPI twitterAPI = new TwitterAPI();
        Report report1 = new Report();
        twitterAPI.getTweet(report1, "banana");
        report.add(report1);
        saveData(report, user);
        loadData(new File("data.json"));
    }
}   
