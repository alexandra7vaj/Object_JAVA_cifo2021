package personExample;

public class TestPants {
    
	public static void executePants() {
		
		createAndTestObjectsPants();
	
	}
      public static void createAndTestObjectsPants() {
	
	//i am going to create an object WITHOUT parameters, that is a empty object
	   Pants p1 = new Pants("Levi's", "red", 50);
	
	   Pants p2 = new Pants("Zara","black", 80);
	
	   Pants p3 = new Pants("Chino","white", 180);
	
	    
  
        System.out.println("Levi's: " + p1.getPrice() + "\n");
		
		System.out.println("Zara: " + p2.getPrice() + "\n"); 
		
		System.out.println("Chino:  " + p3.getPrice() + "\n"); 
		
	}

}
