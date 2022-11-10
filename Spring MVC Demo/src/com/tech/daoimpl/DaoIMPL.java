package com.tech.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.Model.Student;
import com.tech.daoi.DaoI;

@Repository
public class DaoIMPL  implements DaoI{

	@Autowired
	SessionFactory sf;
	@Override
	public int saveData(Student s) {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		int id=(int)session.save(s);
		tx.commit();
	
		System.out.println("Student info with id:"+id+ " is Saved Sucessfully  Id");
		session.close();
		
		return id;
	}
		@Override
		public List<Student> getAllData() {
		
		Session  session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Query q=session.createQuery("from Student");
		
		  List list=   q.getResultList();
		  
		  session.close();

		
		return list;
	}
		@Override
		public List<Student> getSingleData(String us, String pw) 
		{
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			
			Query q=session.createQuery("from Student where  UserName=:UserName and userPass=:userPass");
			      q.setParameter("UserName", us);
			      q.setParameter("userPass", pw);
			    List list=  q.getResultList();
			    
			    tx.commit();
			    session.close();
		
			return list;
		}
		@Override
		public void deleteData(int id) {
			// TODO Auto-generated method stub
			
		}

}
