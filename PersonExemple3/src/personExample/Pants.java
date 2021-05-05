package personExample;

public class Pants {

	//fielda from Pants Class
	
       public string marc;
       public string color;
       public int price;
	
    //Constructor from  Class 
       public Pants(string marc, string color, int price) {
   		super();
   		this.marc = marc;
   		this.color = color;
   		this.price = price;
   	}
      
     //Getters and Setters and toString
       @Override
   	public String toString() {
   		return "Pants [marc=" + marc + ", color=" + color + ", price=" + price + "]";
   	}

	
          

	}


