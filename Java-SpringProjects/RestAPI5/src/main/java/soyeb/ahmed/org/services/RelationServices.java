package soyeb.ahmed.org.services;

import java.util.List;

import soyeb.ahmed.org.DAO.RelationDAO;
import soyeb.ahmed.org.entity.RelationshipEntity;

public class RelationServices {
	RelationDAO relationServices = new RelationDAO();

	public List<RelationshipEntity> getFamilyRelationService(int id) {		
		return relationServices.getRelation(id);
	}
	
	
}
