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
   public Pants(String marc, String color, int price, int heigth, int weigth, double gender) {
		super();
		this.marc = marc;
		this.color = color;
		this.price = price;
		this.heigth = heigth;
		this.weigth = weigth;
		this.gender = gender;
	}

@Override
	public String toString() {
		return "Pants (marc=" + marc + ", color=" + color + ", price=" + price + ", heigth=" + heigth + ", weigth="
				+ weigth + ", gender=" + gender + ")";
	}
    public String getPrice() {
		return null;
	}
   

}


