package com.clients;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.*;

import com.bean.NewBook;


public class BookClient {
	private static SessionFactory sf;
	static
	{
	Configuration config=new Configuration();
	config.configure("/hibernate.cfg.xml");
	sf=config.buildSessionFactory();
	}
	public boolean addBook(String isbn,String title,String author,double price,long stock,Date dop)
	{
		Session session=sf.openSession();
		NewBook book=new NewBook(isbn,title,author,price,stock,dop);
		session.save(book);
		session.flush();// hits the db
		return true;
	}
	public List<NewBook> getBooks()
	{
		Session session=sf.openSession();
		Query query=session.createQuery("from NewBook");
		return query.list();
	}
	public boolean deleteBook(String isbn)
	{
		
		Session session=sf.openSession();
		NewBook bookDeleted=(NewBook)session.get(NewBook.class, isbn);
		if(bookDeleted==null)
			return false;
		session.delete(bookDeleted);
		return true;
		
	}	
	
	
	
	public static void main(String args[]){
		
		BookClient bc=new BookClient();
		/*bc.addBook("101","C++","Bala",1000.0,9,null);
		bc.addBook("102","Java", "horowitz",1099,8,null);*/
		System.out.println(bc.getBooks());
		System.out.println(bc.deleteBook("101"));
	}


}
