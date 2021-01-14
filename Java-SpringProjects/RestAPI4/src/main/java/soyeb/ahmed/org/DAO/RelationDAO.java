package soyeb.ahmed.org.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import soyeb.ahmed.org.entity.FamilyEntity;
import soyeb.ahmed.org.entity.RelationshipEntity;

public class RelationDAO {
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(RelationshipEntity.class)
			.addAnnotatedClass(FamilyEntity.class)
			.buildSessionFactory();
	
	public List<RelationshipEntity> getRelation(int id){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<RelationshipEntity> relationList= session.createQuery("from relation where id_family_union='"+id+"'").getResultList();
		System.out.println(relationList);
		session.close();
		return relationList;		
	}
	
	/*
	public static void main(String[] args) {
		RelationDAO dao = new RelationDAO();
		List<RelationshipEntity> list = dao.getRelation();
		System.out.println(list);
	}
	*/
}
