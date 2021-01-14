package soyeb.ahmed.org;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/union")
public class mainResource {

	@Path("/Family")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entity> getIt() {
    	List<Entity> list= new ArrayList<>();
    	list.add(new Entity("Soyeb","Ahmed",28));
    	list.add(new Entity("Nasir","Ahmed",31));
    	list.add(new Entity("Kanon","Ahmed",31));
        return list;
    }
	
	@Path("/Family")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entity> postIt() {
    	List<Entity> list= new ArrayList<>();
    	list.add(new Entity("Nasir","Ahmed",31));
        return list;
    }

	@Path("/Family/{age}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entity> putIt(@PathParam("age") int age) {
    	List<Entity> list= new ArrayList<>();
    	list.add(new Entity("Soyeb","Ahmed",age));
        return list;
    }

	@Path("/Family/{age}/{name}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entity> deleteIt(@PathParam("age") int age,
    		@PathParam("name") String name) {
    	List<Entity> list= new ArrayList<>();
    	list.add(new Entity(name,"Ahmed",age));
        return list;
    }
}
