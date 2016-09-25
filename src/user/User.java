/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Badge.Badge;

/**
 *
 * @author Garry
 */
public class User {
    private String user;
    private int daysGood;
    public Badge badge[];
    public Badge viewBadge;
    
    public void setUser(String user){
        this.user = user;
    }
    public void incrementDaysGood(){
        daysGood++;
    }
    public void setBadge(Badge[] badge){
        this.badge = badge;
    }
    public void setViewBadge(Badge badge){
        this.viewBadge = badge;
    }
    public String getUser(){
        return user;
    }
    public int getDaysGood(){
        return daysGood;
    }
    public Badge[] getBadgeArray(){
        return badge;
    }
    public Badge getViewBadge(){
        return viewBadge;
    }
}
