package progect_5;

public class TestPant {

	public static void executePant() {

		createAndTestObjectsPant();

	}

	public static void createAndTestObjectsPant() {

		//create an object without parameters class Pant,
		Pant p1 = new Pant("Levi's ","red ", "L", 150);
		Pant p2 = new Pant("Zarra ","black ", "M", 35);
		Pant p3 = new Pant("Chino", "blue ", "S", 15);
		
		
		// p1 object, calls toString Method
		p1.toString();
		p2.toString();
		p3.toString();
		
		
		System.out.println(p1.toString());
		
		System.out.println(p1);
		
		System.out.println(p2);
		
		System.out.println(p3);
	}
}
