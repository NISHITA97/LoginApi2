package model;


import dao.Database;
import dao.Project;
import dto.FeedObjects;
import java.sql.Connection;
import java.util.ArrayList;

public class ProjectManager {
	
	
	public ArrayList<FeedObjects>  GetFeeds(String userId  , String userpass)throws Exception {
            
          ArrayList<FeedObjects> feedData = null;
               
		try {
			   Database database= new Database();
			   Connection connection = database.Get_Connection();
                           Project project= new Project();
			   feedData =project.GetFeed(connection , userId , userpass);
                           
                           
                               
		
		} catch (Exception e) {
			throw e;
		}
		return feedData;
	}

}
