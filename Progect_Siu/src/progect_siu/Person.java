package progect_siu;

public class Person {

	//fields from Person Class - atributos de persona;
	public String name; //Sting - cadena de texto;
	public String lastNme; //Cugnom;
	public String nickName; // - deminiutivo nom;
	public String colorHair; //en conbinaciò de paraules, segona va amb majuscula;
	public String colorEyes;
	public String gender;
	public int age;
	public int heigth;
	public int weigth;
	public double basicSalary;
	public String sizePants;
	
	
	//Constructor from Person Class_Siempres es publico y no tiene return
	//- asigna el balor a atributo;
	// - crear objeto de esta classe;

	public Person(String name, String lastNme, String nickName, String colorHair, String colorEyes, String gender,
			int age, int heigth, int weigth, double basicSalary) {
		
		this.name = name;
		this.lastNme = lastNme;
		this.nickName = nickName;
		this.colorHair = colorHair;
		this.colorEyes = colorEyes;
		this.gender = gender;
		this.age = age;
		
		this.heigth = heigth;
		this.weigth = weigth;
		this.basicSalary = basicSalary;
	}
	
	
	public Person(String name, String nickName, String gender, int age, int heigth, int weigth) {
		//el constructor simple que vull utilizar en "calcul";
		this.name = name;
		this.nickName = nickName;
		this.gender = gender;
		this.age = age;
		this.heigth = heigth;
		this.weigth = weigth;
	}


	// Methods from Person Class_todos los metodos poner dentro de la clase;
	 public void becomeOlder() {
	    	
	    	this.age = age + 1;
	    }
	 public void calculSizePants() {
		 
		 if (this.heigth <= 150 && this.weigth <= 38 && this.gender.equals("W")) //condiciò per complir;
		 {
			this.sizePants = "S"; //si compleix serà;
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
		return "Person [name=" + name + ", lastNme=" + lastNme + ", nickName=" + nickName + ", colorHair=" + colorHair
				+ ", colorEyes=" + colorEyes + ", gender=" + gender + ", age=" + age + ", heigth=" + heigth
				+ ", weigth=" + weigth + ", basicSalary=" + basicSalary + "]";
	}	






	
	


	
	

}



