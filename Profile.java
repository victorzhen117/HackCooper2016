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
public class Profile {
    private String pName;
    private int pScore;
    private int pDaysGood;
    private Badge[] pBadge;
    private Badge pViewableBadge;
    
    public String getName(){
        return this.pName;
    }
    
    public int getPScore(){
        return this.pScore;
    }
    
    public int getDaysGood(){
        return this.pDaysGood;
    }
    
    public Badge[] getBadgeList(){
        return this.pBadge;
    }
    
    public Badge getViewableBadge(){
        return this.pViewableBadge;
    }
    
    public void incScore(){
        this.pScore ++;
    }
    
    public void incDaysGood(){
        this.pDaysGood ++;
    }
    
    public void resetScore(){
        this.pScore = 0;
    }
    
    public void resetDaysGood(){
        this.pDaysGood = 0;
    }
    
    public void setDaysGood(int amount){
        this.pDaysGood = amount;
    }
}
