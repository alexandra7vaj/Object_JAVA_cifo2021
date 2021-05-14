package progect_siu;

import java.util.Scanner;

public class TestPerson {
	                                         // es un metodo estattico que puedo llamar este methodo sin
                                             //construir un objeto de este classe
	   public static void executePerson() { //es un methodo que llamare deste Int;
		Scanner scanner = new Scanner(System.in);
         
		System.out.println("Give your name: ");
		String name = scanner.nextLine(); //el programa llegeix el que ha introduït l'usuari, i guarda en la variable name;
		
		System.out.println("Give your nickName: ");
		String nickName = scanner.nextLine();
		
		System.out.println("Give your gender: ");
		String gender = scanner.nextLine();
		
		System.out.println("Give your age: ");
		int age = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Give your height: ");
		int height = Integer.valueOf(scanner.nextLine());//con methodo_valueOf_ transforma la linia de texto en xifre;
		
		System.out.println("Give your weight: ");
		int weight = Integer.valueOf(scanner.nextLine());
		
		
		
		//Ara construeixo la persona, segon les varibles donades per user;
		Person user = new Person (name, nickName, gender, age, height, weight);
		user.calculSizePants(); 
		
		System.out.println("Your size is: " + user.sizePants);
		
		   
		    //cal utilisar parametros de constructor simple    
		   //Person siu = new Person("Zuzana", "Siu", "W", 36, 169, 66);  
		  
		   //siu.calculSizePants();//llamo al metodo para calcular la talla (se asigna al atributo sizePants el valor)
		   
		   //System.out.println("TALLA DE SIU ES " + siu.sizePants);
		   
		   user.becomeOlder();
		   System.out.println("You got older " + user.name  +  user.age);
	   }
		
		
		
		
	

	}


