package soyeb.ahmed.org.services;

import java.util.List;

import soyeb.ahmed.org.DAO.FamilyDAO;
import soyeb.ahmed.org.entity.FamilyEntity;

public class FamilyServices {
	FamilyDAO serviceDAO = new FamilyDAO();

	public List<FamilyEntity> getFamilyService() {
		List<FamilyEntity> list = serviceDAO.getFamily();
		return list;
	}

	public void addFamilyService(FamilyEntity family) {
		serviceDAO.addFamily(family);
		
	}

	public void updateFamilyService(FamilyEntity updateFamily) {
		
		serviceDAO.updateFamily(updateFamily);
	}

	public void deleteFamilyService(int id) {
		
		serviceDAO.deleteFamily(id);
	}
	
	
}
