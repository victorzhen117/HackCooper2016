package JavaFiles;
import java.awt.List;
import java.util.ArrayList;


public class Server {
	
	static ArrayList<User> uList = new ArrayList<User>();
	static ArrayList<Report> rList = new ArrayList<Report>();
	
	public static void createProfile(String name, int ID){
		uList.add(new User());		
	}
	
	public static void createReport(){
		//score
		//timeschecked
		rList.add(new Report());
	}
	
	public static User getProfile(int index){
		return uList.get(index);
	}
	
	public static Report loadReports(long ID){
		for(int i=0; i<rList.size(); i++){
			if(ID==rList.get(i).getTweetID()){
				return rList.get(i);
			}
		}
		return null;
	}
}
