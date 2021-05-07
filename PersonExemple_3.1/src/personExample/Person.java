package personExample;

import java.util.ArrayList;

public class Person {

	 //fields from Person Class
		public String name;
		public int age;
		public double basicSalary;
		public double money;
		public int heigth;
		public int weigth;
		public double gender;
		
		
		
		//Constructor from Person Class_Siempres es publico y no tiene return
		public Person(String name, int heigth, int weigth, double gender) {
	 		
	 			this.name = name;
	 			this.heigth = heigth;
	 			this.weigth = weigth;
	 			this.gender = gender;
	 		}
	 		
		
		
	    public Person(String name, int age, int weigth, int heigth, double basicSalary) {
			
			this.name = name;
			this.age = age;
			this.weigth = weigth;
			this.heigth = heigth;
			this.basicSalary = basicSalary;
		}
		
		public Person(String name) {
		
			this.name = name;
		}

		

		public Person(String name, int age) {
			
			this.name = name;
			this.age = age;
		}


			// Methods from Person Class_que hace el object
		    
		    public void becomeOlder() {
		    	
		    	this.age = age + 1;
		    }
		    public void payTaxes(double moneyToPay) {
		    	this.money = money - moneyToPay;
		    }
		
			public double yearNetSalary() {
				
				double yearNetSalary = 0.0;
				
				// first i must check weather THIS object have got money
				// this.basicSalary > 1
				if(this.basicSalary > 1) {
					yearNetSalary = this.basicSalary * 14;
					
					if(this.age > 30) {
				} else {
					yearNetSalary = yearNetSalary * 0.94;
				}
				} else {
					System.out.println(name + "has not got any salary, so YearNetSalary not available!");
				}
				
				return yearNetSalary;
			}
					
		
			
			//Getters and Setters and toString
		
	 	public String getName() {
			return name;
		}
		public Person(String name, int age, double basicSalary, double money, int heigth, int weigth, double gender) {
			super();
			this.name = name;
			this.age = age;
			this.basicSalary = basicSalary;
			this.money = money;
			this.heigth = heigth;
			this.weigth = weigth;
			this.gender = gender;
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
		public int getWeigth() {
			return weigth;
		}
		public void setWeigth(int weigth) {
			this.weigth = weigth;
		}
		public int getHeigth() {
			return heigth;
		}
		public void setHeigth(int heigth) {
			this.heigth = heigth;
		}
		public double getBasicSalary() {
			return basicSalary;
		}
		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}


		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth + ", basicSalary="
					+ basicSalary + ", money=" + money + ", yearNetSalary()=" + yearNetSalary() + ", getName()=" + getName()
					+ ", getAge()=" + getAge() + ", getWeigth()=" + getWeigth() + ", getHeigth()=" + getHeigth()
					+ ", getBasicSalary()=" + getBasicSalary() + "]";
		}
	
	}
