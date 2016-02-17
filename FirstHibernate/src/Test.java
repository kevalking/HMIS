import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class Test {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Student e1=new Student();  
    e1.setId(2);  
    e1.setName("sonoo");  
      
    session.persist(e1);//persisting the object  
      
    t.commit();//transaction is commited  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  