package com.cjc.DaoImpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.DaoI.HomeDaoI;
import com.cjc.model.Student;
@Repository
public class HomeDaoImpl implements HomeDaoI {
  @Autowired
  SessionFactory sf;
  
	@Override
	public int saveData(Student s) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		int id=(int)session.save(s);
		tx.commit();
		session.close();
		
		return id;
	}

	@Override
	public List<Student> getAllData() {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("from Student");
	    List list=	q.getResultList();
		
		return list;
	}

	@Override
	public int logincheck(String us, String ps) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("from Student where user=:user and pass=:pass");
		q.setParameter("user", us);
		q.setParameter("pass", ps);
	List list=	q.getResultList();
		tx.commit();
		int i=1;
		return 0;
	}

	@Override
	public void deleteData(int id) {
		Session session=sf.openSession();
		
	Student stu=session.get(Student.class, id);
	
		session.delete(stu);
		Transaction tx=session.beginTransaction();
		tx.commit();
		//Query q=session.createQuery("from Student");
		//List<Student>list=q.getResultList();
		
		
		
	}

	@Override
	public List<Student> singleData(String us, String ps) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("from Student where user=:user and pass=:pass");
		q.setParameter("user", us);
		q.setParameter("pass", ps);
	List list=	q.getResultList();
		tx.commit();
		
		return list;
	}

	@Override
	public Student editData(int id) {
		Session session=sf.openSession();
		
		Student stu=session.get(Student.class,id);
		session.update(stu);
		session.beginTransaction().commit();
		
		
		return stu;
	}

	@Override
	public void updateData(Student stu) {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(stu);
	    tx.commit();
	    Query q=session.createQuery("from Student");
	    q.getResultList();
	
		

		
	}


}
