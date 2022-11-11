package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.DaoI.HomeDaoI;
import com.cjc.model.Student;
import com.cjc.service.ServiceI;
@Service
public class HomeServiceImpl implements ServiceI{
    @Autowired
    HomeDaoI hd;
    
	@Override
	public int saveData(Student s) {
		
		
		return hd.saveData(s);
	}
	@Override
	public List<Student> getAllData() {
		
		return hd.getAllData();
	}
	@Override
	public int logincheck(String us, String ps) {
	
		return hd.logincheck(us, ps);
	}
	@Override
	public void deleteData(int id) {
		
		hd.deleteData(id);
		
	}
	@Override
	public List<Student> singelData(String us, String pw) {
		return hd.singleData(us, pw);
	}
	@Override
	public Student editData(int id) {
		return hd.editData(id);
	}
	@Override
	public void updateData(Student stu) {
		hd.updateData(stu);
	}
	
	

}
