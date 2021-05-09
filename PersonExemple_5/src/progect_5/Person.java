package progect_5;

public class Person {

	//fields from Person Class
	public String name; //Sting - text;
	public String gender;
	public int age;
	public int heigth;
	public int weigth;
	public String sizePants;

	
	//Constructor from Person Class
	public Person(String name, String gender, int age, int heigth, int weigth, String sizePants) {
		
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.heigth = heigth;
	this.weigth = weigth;
	this.sizePants = sizePants;
	}
	
	//the simple constructor that I want to use in "calcul";
	public Person(String name, String gender, int heigth, int weigth) {
	
		this.name = name;
		this.gender = gender;
		this.heigth = heigth;
		this.weigth = weigth;
		//public String sizePants - I want to calculate why it is not active
	}
	
	// Methods from Person Class !!¡¡ all methods put inside the class;
	public void calculSizePants() {
		 
		 if (this.heigth <= 150 && this.weigth <= 38 && this.gender.equals("W")) //condition for compliance;
		 {
			this.sizePants = "S"; //if it comes true it will be this;
		  }
		 
		 if ( this.heigth == 190 && this.weigth == 60 && this.gender.equals("W")) 
           {
           	this.sizePants = "M";
           }
		 
		 if (this.heigth >= 190 && this.weigth >= 60 || this.gender.equals("W")) 
            {
	         this.sizePants = "L";
	         }
	  	
	      }
	
	@Override
      public String toString() {
	  return "Person (name=" + name + ", gender=" + gender + ", age=" + age + ", heigth=" + heigth + ", weigth="
			+ weigth + ", sizePants=" + sizePants + ")";
    }

	
}


