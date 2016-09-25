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
public class ReportingSystem {
    private Report[] allReports;
    
    public void getReportStatus(Report r, Profile p){
        if(r.getTimesChecked() == 10){
            checkReportScore(r,p);
        }
    }
    
    public void checkReportScore(Report r, Profile p){
        if(r.getScore() >= 8){
            p.setDaysGood(0); //sets daysgood = 0
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
