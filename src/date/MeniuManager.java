package date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MeniuManager {

	public MeniuManager() {
		// TODO Auto-generated constructor stub
	}

protected SessionFactory sessionFactory;
	
	protected void setup() {
        // code to load Hibernate Session factory
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    	        .configure() // configures settings from hibernate.cfg.xml
    	        .build();
    	try {
    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	} catch (Exception ex) {
    	    StandardServiceRegistryBuilder.destroy(registry);
    	}
    }
 
    protected void exit() {
        // code to close Hibernate Session factory
    	sessionFactory.close();
    }
 
    protected void create() {
        // code to save a book
        Produs produs = new Produs();
        produs.setCategorie(1);
        produs.setNumeProdus("Produs nou introdus");
        produs.setDescriereProdus("DESCRIERE Produs nou introdus");
        produs.setPretUnitar(25.00);
        produs.setStoc(200);
        produs.setNivelAlerta(20);
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.save(produs);
     
        session.getTransaction().commit();
        session.close();
    }
 
    protected void read(Integer idProdus) {
        // code to get a book
        Session session = sessionFactory.openSession();
        
//        Integer idProdus = 20;
        Produs produs = session.get(Produs.class, idProdus);
     
        System.out.println("Denumire: " + produs.getNumeProdus());
        System.out.println("Descriere: " + produs.getDescriereProdus());
        System.out.println("Pret: " + produs.getPretUnitar());
     
        session.close();
    }
 
    protected void update() {
        // code to modify a book
    	Produs produs = new Produs();
        produs.setIdProdus(125);
        produs.setCategorie(1);
        produs.setNumeProdus("PRODUS DE Produs nou introdus");
        produs.setIdProdus(125);
        produs.setDescriereProdus("PRODUS DE DESCRIERE Produs nou introdus");
        produs.setPretUnitar(25.00);
        produs.setStoc(200);
        produs.setNivelAlerta(20);
     
        Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.update(produs);
     
        session.getTransaction().commit();
        session.close();
    }
 
    protected void delete(Integer idProdus) {
        // code to remove a book
    	Produs produs = new Produs();
        produs.setIdProdus(idProdus);
     
        Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.delete(produs);
     
        session.getTransaction().commit();
        session.close();
    }
 
    public static void main(String[] args) {
        // code to run the program
        MeniuManager manager = new MeniuManager();
        manager.setup();
        
        manager.create();
//        manager.read(100);
//        manager.delete(123);
//        manager.update();
     
        manager.exit();
    }
	
}
