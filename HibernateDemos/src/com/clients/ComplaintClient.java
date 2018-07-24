package com.clients;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.bean.Complaint;
import com.bean.Customer;

import sun.rmi.server.Util;

public class ComplaintClient {
	private static SessionFactory sf;
	static
	{
		Configuration config=new Configuration();
		config.configure("/hibernate.cfg.xml");
		sf=config.buildSessionFactory();
	}

	public static Date convert(String date)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
		java.util.Date utilDate=sdf.parse(date);
		sdf.format(utilDate);
		Date sqlDate=new Date(utilDate.getTime());
		return sqlDate;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Date(new java.util.Date().getTime());
	}

	public List<String> retreive()
	{
		Session session=sf.openSession();
		Query query=session.createQuery("select compl.customer.cList from Complaint compl where compl.status=?");
		query.setParameter(0,"open");
		System.out.println(query.list());
		return (List<String>) query.uniqueResult();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*Customer c1=new Customer("sam123","sam@gmail.com");
		Complaint cm1=new Complaint("internet problem",c1,convert("12/02/2017"),"open");
		Complaint cm2=new Complaint("Lagging ",c1,convert("13/01/2018"),"open");
		List<Complaint> cList=new ArrayList<>();
		cList.add(cm1);cList.add(cm2);
		c1.setcList(cList);
		Session session=sf.openSession();
		session.getTransaction().begin();
		session.save(c1);
		session.getTransaction().commit();*/
		ComplaintClient o=new ComplaintClient();
		System.out.println(o.retreive());
		Session session=sf.openSession();
		Customer c2=(Customer)session.get(Customer.class, "sam123");

	}

}
