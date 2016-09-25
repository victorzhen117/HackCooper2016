/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportingsystem;

/**
 *
 * @author justi
 */
public class Report {
    private int score;
    private int timesChecked;
    
    public void incrementScore(int incValue){
        this.score++;
    }
    
    public void incrementTimesChecked(){
        timesChecked++;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public int getTimesChecked(){
        return this.timesChecked;
    }
}
