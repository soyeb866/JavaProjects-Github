package soyeb.ahmed.org.subresources;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import soyeb.ahmed.org.entity.RelationshipEntity;
import soyeb.ahmed.org.services.RelationServices;

//@Path("/union/FNF")
public class subResources {

	RelationServices relationServices = new RelationServices();

	//@Path("/{id}/relation")
	//@Path("demmo")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<RelationshipEntity> getRelation(@PathParam("id") int id) {
		List<RelationshipEntity> list = relationServices.getFamilyRelationService(id);
		return list;
	}
}
