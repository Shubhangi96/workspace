package com.clients;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Address;
import com.bean.Department;
import com.bean.Employee;
import com.bean.NewBook;

public class onetooneclient {
	private static SessionFactory sf;
	static
	{
		Configuration config=new Configuration();
		config.configure("/hibernate.cfg.xml");
		sf=config.buildSessionFactory();
	}
	@SuppressWarnings("unchecked")
	public List<String> retreive()
	{
		Session session=sf.openSession();
		Query query=session.createQuery("select e.name from Employee e where e.d.deptid=?");
		query.setParameter(0,1L);
		return (List<String>)query.list();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department("Math");
		Employee e1=new Employee("rachna","ra@gmail.com",null,d1);
		Address add1=new Address("Mg rd","Blr","KA","India",e1);
		
		e1.setA(add1);
		Session session=sf.openSession();
		session.getTransaction().begin();
		session.save(e1);
		session.getTransaction().commit(); //using commit instead of flush
	
		
		//Employee emp=(Employee)session.get(Employee.class,1L);
		onetooneclient o=new onetooneclient();
		System.out.println(o.retreive());
		
		

	}

}
