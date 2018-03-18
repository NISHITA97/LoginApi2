package com.mycompany.mavenproject2;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import model.ProjectManager;
import com.google.gson.Gson;
import dto.FeedObjects;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class FeedService {
	
	
      
      @GET
	@Path("/{userId}/{userpass}")
      @Produces("application/json")
      
      public String data(@PathParam("userId") String  userId , @PathParam("userpass") String  userpass  )
      { 
           ArrayList<FeedObjects> feedData = new ArrayList<FeedObjects>();
           String feeds = null;
          try{
              
          ProjectManager projectManager= new ProjectManager();
          feedData = projectManager.GetFeeds(userId, userpass);
          Gson gson = new Gson();
	  System.out.println(gson.toJson(feedData));
	  feeds = gson.toJson(feedData);
       
           }
      catch (Exception e)
		{
			System.out.println("error");
		}
          
          return feeds;
      }
      

    
}
