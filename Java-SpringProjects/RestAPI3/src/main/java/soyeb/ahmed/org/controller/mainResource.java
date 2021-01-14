package soyeb.ahmed.org.controller;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import soyeb.ahmed.org.DAO.FamilyDAO;
import soyeb.ahmed.org.entity.FamilyEntity;
import soyeb.ahmed.org.services.FamilyServices;

@Path("/union")
public class mainResource {

	
	FamilyServices services = new FamilyServices();
	
	
	@Path("/Family")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<FamilyEntity> getIt() {
		List<FamilyEntity> list = services.getFamilyService();
        return list;
    }

	@Path("/Family")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void postIt(FamilyEntity family) {
		
		services.addFamilyService(family);;
    }
	
	@Path("/Family/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateIt(FamilyEntity updateFamily, @PathParam("id") int id) {
		updateFamily.setFamilyId(id);
		services.updateFamilyService(updateFamily);
    }

	@Path("/Family/{id}")
    @DELETE
    public void deleteIt(@PathParam("id") int id) {
		services.deleteFamilyService(id);
    }

}
