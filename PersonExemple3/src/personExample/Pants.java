package personExample;

public class Pants {

	//fielda from Pants Class
	
       public String marc;
       public String color;
       public int price;
       
   	   public int heigth;
   	   public int weigth;
   	   public double gender;
   		
   	   
       
	
    //Constructor from  Class 
       public Pants(String marc, String color, int price) {
   	
   		this.marc = marc;
   		this.color = color;
   		this.price = price;
   	}
      
     //Getters and Setters and toString
       @Override
   	public String toString() {
   		return "Pants [marc=" + marc + ", color=" + color + ", price=" + price + "]";
   	}
       public String getPrice() {
   		return null;
   	}
       
          

	}


