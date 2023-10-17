package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.query.criteria.internal.compile.CriteriaQueryTypeQueryAdapter;

import dto.student;

public class studentdao 
{
   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
   EntityManager manager=emf.createEntityManager();
   EntityTransaction transaction=manager.getTransaction();
public void save(student std) 
{
	transaction.begin();
	manager.persist(std);
	transaction.commit();
	
}
public List<student> fetch() 
{
	// TODO Auto-generated method stub
	return manager.createQuery("select x from student x").getResultList();
}
public void delete(int id) {
	transaction.begin();
	manager.remove(manager.find(student.class , id));
	transaction.commit();
	
}
public void edit(student std) 
{
transaction.begin();
manager.merge(std);
transaction.commit();
	
}
   
   
   
}
