package com.cjc.conrtoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.Student;
import com.cjc.service.ServiceI;
import com.sun.javafx.sg.prism.NGShape.Mode;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;

@Controller
public class HomeController {

	@Autowired
	ServiceI si;

	@RequestMapping("/reg")
	public String register(@ModelAttribute Student s)
	{
		System.out.println("in reg page");
		int id=si.saveData(s);
		if(id>0)
		{
			return "index";
		}
		else
		{
			return "register";
		}
		
		
	}
	
	
	@RequestMapping("/log")
	public String getData(@RequestParam("user")String us,@RequestParam("pass")String ps, Student s,Model m)
	
	{ 
		System.out.println("in log");
		if(us.equals("admin")&& ps.equals("123"))
		{
	    int i=	si.logincheck(us, ps);
		List<Student>l=	si.getAllData();
		
		m.addAttribute("data",l);
			return "success";
		}
			
		else if(us.equals(us)&&ps.equals(ps))
		{
			List<Student>li=si.singelData(us, ps);
			m.addAttribute("data",li);
			return "success";
		}
		else
		return "index";
		
	}
	
	@RequestMapping("/delete")
	public String deleteData(@RequestParam ("rd")int id,Model m)
	{
		si.deleteData(id);
		List<Student>l=si.getAllData();
		m.addAttribute("data",l);
		return "success";
		
	}
	@RequestMapping("/edit")
	public String editData(@RequestParam ("rd")int id,Model m)
	{
		
		Student stu=si.editData(id);
		m.addAttribute("data",stu);
		return "update";
		
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,Model m)
	{
		si.updateData(s);
		List<Student>l=si.getAllData();
		m.addAttribute("data",l);
		return "success";
		
	}
	
	
	
	

}
