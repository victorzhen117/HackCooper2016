import java.awt.List;
import java.util.ArrayList;


public class Server {
	
	ArrayList<Profile> pList = new ArrayList<Profile>();
	
	public static void createProfile(String name, int ID){
		Profile p = new Profile();
		p.setName(name);
		p.setID(ID);
		p.setNumberOfDaysGood(0);
		//name of person
		//sid
		//number of days good
		
	}
	
	public static void createReport(){
		//score
		//timeschecked
		Report r = new Report();
		r.setScore(0);
		r.setTimesChecked(0);
	}
	
	public static Profile getProfile(int index){
		return pList.get(index);
	}
	
	public static void loadReports(){
		
	}
}
