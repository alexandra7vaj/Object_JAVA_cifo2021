package personExample;

import java.util.ArrayList;

public class TestPerson {
	
	// ----- Start ----
	//it is function is not execute all the designed methods
	//test them etc...
	//that is, to start the program and define
	//the tempo, the sequencing of executing
    public static void executePerson() {
		
		createAndTestObjectsPerson();
		//setAndGetTestObjectsPerson();
		//testMethodsobjectsPerson();
		testListObjectsPerson();
	
	}
    
	//----- no lo se metodos -----
	public static void createAndTestObjectsPerson() {
		
		//i am going to create an object WITHOUT parameters, that is a empty object
		Person sergi = new Person();
		
		Person isa = new Person("Isabel", 18);
		
		Person toni = new Person("Antonio", 30, 80, 180, 2000);
		
		
		
		//sergi object, that is, tag "sergi" call toString Method_una cadena de operaciones
		
		sergi.toString();
		
		//and now i am poing to use toString to print this object
		
		System.out.println(sergi.toString());
		
		//this Eclipse IDE allows me to use object without toString
		System.out.println(toni);
		
		System.out.println(isa);
		
		sergi.setName("Sergi");
		sergi.setAge(20);
		sergi.setWeigth(60);
		sergi.setHeigth(100);
		sergi.setBasicSalary(2000);
		
		System.out.println(sergi);
		
		System.out.println("Sergi's age: " + sergi.getAge() + "\n");
		
		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 30y ears
		toni.becomeOlder();
		
		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 31years
		
	
	}
	
	public static void testMethodsObjectsPerson() {}
	
	public static void testListObjectsPerson() {
	
	 
		//create a variable people that is a ArrayList and assign a new ArrayListwhich
		//point to Person
		ArrayList<Person> people = new ArrayList<Person> ();
		
		//ceate three Person Objects
		//remember: i need three constructors!!
		Person alexa = new Person("Alexa", 25, 60, 180, 2500);
		Person jack = new Person("Jackson Pollock", 25);
		Person marc = new Person();
		
		//we add the previous created objects to People ArrayList
		people.add(alexa);
		people.add(jack);
		people.add(marc);
		
		//llama a metodo printPiople con parametro people y imprima 
		printPeople(people);
		
		//System.out.println( people.toString() );
		
	}
	
	//------ utils ----
	 private static void printPeople(ArrayList<Person> arrayToPrint) {
		 
		 System.out.println("People:");
		 
		 for (Person personToPrint : arrayToPrint) {
			 System.out.println(personToPrint);
		 }
	     System.out.println("\n");
	}
}

