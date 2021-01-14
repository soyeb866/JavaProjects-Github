package ahmed.org.newTest;


import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("myresource")
public class MyResource {


    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Entity> getIt() {
    	List<Entity> list= new ArrayList<>();
    	list.add(new Entity("Soyeb","Ahmed",28));
    	list.add(new Entity("Nasir","Ahmed",31));
    	list.add(new Entity("Kanon","Ahmed",31));
        return list;
    }
}
