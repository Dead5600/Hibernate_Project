package hibernatepracticePojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetching_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee emp = (Employee)session.load(Employee.class, 2);
		System.out.println(emp.getEmpName());
		
		
		
		session.close();
		factory.close();
	}

}
