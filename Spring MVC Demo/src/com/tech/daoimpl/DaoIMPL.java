package com.tech.daoimpl;

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
	
		System.out.println("Student info with id:"+id+ "is Saved Sucessfully  Id");
		session.close();
		
		return id;
	}

}
