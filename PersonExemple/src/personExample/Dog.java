package personExample;

public class Dog {

	//field from Dog Class
	public String name;
	public int age;
	public int heigth;
	public double park;
	
	
	//Constructor from Dog Class
	public Dog() {
	}
	
    public Dog(String name, int age, int heigth) {
		
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		
	}
	
	// Methods from Dog Class
	public void becomeOlder() {
		this.age = age + 7;
	}
	public void walk(double walkPark) {
		this.park = park - walkPark;
	}
	
	
	//Getters and Setters and toString
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Dog (name=" + name + ", age=" + age + ", heigth=" + heigth + ")";
	}	
	
}


