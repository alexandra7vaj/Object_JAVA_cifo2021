package progect_siu;

public class TestDog {

	//это метод которорый будет звать другие субметодоы
		public static void executeDog () {
			
			//создаю объект
			generatingDogs(); 
		}
		
		private static void generatingDogs() {
			
			Dog kira = new Dog ("Kira", 11, "cocker spaniel", 16);

			
			System.out.println("Who's Kira? " + kira);
			
			//System.out.println(kira and I);
			
			
		}
		
		

	}
	