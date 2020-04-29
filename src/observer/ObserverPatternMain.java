package observer;

public class ObserverPatternMain {

	  
	   public static void main(String[] args) {
	    Person peshoPerson=new Person("Pesho");
	    Person ivanPerson=new Person("Ivan");
	    
	    Product iphoneMobile=new Product("Iphone", "Mobile", "Not available!");
	    
	     
	    iphoneMobile.registerObserver(peshoPerson);
	    iphoneMobile.registerObserver(ivanPerson);

	    iphoneMobile.setAvailability("Available");
	    
	   }
	}
