package personExample;

public class Size {

  //fielda from Size Class
	public int heigth;
	public int weigth;
	public double gender;
	

 //Constructor from  Class 
   public Size(int heigth, int weigth, double gender) {
		
		this.heigth = heigth;
		this.weigth = weigth;
		this.gender = gender;
	}
	
	
  public int getHeigth() {
		return heigth;
	}



	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}


	public int getWeigth() {
		return weigth;
	}


	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}


	public double getGender() {
		return gender;
	}


	public void setGender(double gender) {
		this.gender = gender;
	}
   
   


@Override
public String toString() {
	return "Size (heigth=" + heigth + ", weigth=" + weigth + ", gender=" + gender + ")";
}
	

	}


