package personExample;

public class TestPerson {

	public static void executePerson() {
		
		createAndTestObjectsPerson();
		//setAndGetTestObjectsPerson();
		//testMethodsobjectsPerson();

	}
    
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
	
}

