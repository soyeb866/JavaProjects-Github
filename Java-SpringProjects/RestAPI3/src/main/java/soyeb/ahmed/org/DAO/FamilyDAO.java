package soyeb.ahmed.org.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import soyeb.ahmed.org.entity.FamilyEntity;

public class FamilyDAO {
	SessionFactory factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(FamilyEntity.class)
							.buildSessionFactory();
	
	public List<FamilyEntity> getFamily(){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<FamilyEntity> list= session.createQuery("from family").getResultList();
		session.close();
		return list;		
	}
	
	public void addFamily(FamilyEntity postFamily){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(postFamily);
		session.getTransaction().commit();		
	}

	public void updateFamily(FamilyEntity updateFamily) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		FamilyEntity family= session.get(FamilyEntity.class, updateFamily.getFamilyId());
		family.setFirst_name(updateFamily.getFirst_name());
		family.setLast_name(updateFamily.getLast_name());
		family.setEmail(updateFamily.getEmail());
		session.getTransaction().commit();	
		
	}

	public void deleteFamily(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		FamilyEntity deleteFamily= session.get(FamilyEntity.class, id);
		session.delete(deleteFamily);
		session.getTransaction().commit();
	}
}
