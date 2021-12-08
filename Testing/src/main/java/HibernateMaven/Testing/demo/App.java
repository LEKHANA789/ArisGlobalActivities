package HibernateMaven.Testing.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Project started !");
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory f=cfg.buildSessionFactory();
    	Student s=new Student();
    	s.setId(2);
    	s.setName("Shashidharan");
    	s.setCity("Thimpu");
    	Session se=f.openSession();
    	Transaction t=se.beginTransaction();
    	se.save(s);
    	t.commit();
    	se.close();
   }
}
  

