package hibernatepracticePojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("programme Started......");
		
		//configuration 
		Configuration cfg = new Configuration();
		cfg.configure();
		
		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();
		
		// creating session
		Session session = factory.openSession();
		
		// Creating an employee object
		Employee e1 = new Employee("prathamesh","kolhapur","Developer");
		Employee e2 = new Employee("swapnil", "kadgaon","tester");
		
		//creating transaction
		Transaction tx = session.beginTransaction();
		
		// saving object to the database 
		session.save(e1);
		session.save(e2);
		
		//Committing transaction
		tx.commit();
		
		session.close();
		factory.close();
		System.out.println("done......");
	} 

}
