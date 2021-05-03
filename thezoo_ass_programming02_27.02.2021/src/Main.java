import java.util.*;

public class Main {
	
	static //ArrayList that all animals will be added to ...
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	
	/* list the i can use too split up the mammal type making them 
	 * easier to list, however the enviorment list i will have to 
	 * create a loop to search each animal for the aniamlType variable ...
	 */
	static ArrayList<Mammal> mammalList = new ArrayList<Mammal>();
	static ArrayList<Bird> birdList = new ArrayList<Bird>();
	static ArrayList<Fish> fishList = new ArrayList<Fish>();
	static ArrayList<Reptile> reptileList = new ArrayList<Reptile>();
	
	static Scanner imp = new Scanner(System.in);


	
	

	public static void main(String[] args) {
		
		createAnimals();
		boolean loop = true;
		
		while(loop == true) {
		System.out.println(" ||-----------------------------------------|| "+
				"\n   Welcome to the York St Johns Zoo"+
				"\n   What would you like to do..."+
				"\n   1. Full info on animal"+
				"\n   2. search for animal by type"+
				"\n   3. search for animal by enviorment"+
				"\n   4. add animal (not avilable yet...)"+
				"\n   5. Exit"+
				"\n ||-----------------------------------------||");
		
		String choice = imp.next();
		
		switch(choice) {
		case "1" :
			animalFullInfo();
			break;
		case "2" :
			displayAnimalTypeList();
			break;
		case "3" :
			displayEnviormentList();
			break;
		case "4" :
			addAnAnimal();
			break;
		case "5" :
			loop = false;
			break;
		default :
			System.out.println("Invaild input ...");
			break;		
		}
		
		}
		
		
	}


	private static void addAnAnimal() {

		
	}


	private static void animalFullInfo() {
		
		System.out.println(" Enter the name of the animal you want full info on ....");
		String input = imp.next();
		
		//NTS come back too dont knwo why this doesn't work ...
		
		for(int i = 0; i < animalList.size(); i++) {
			if(animalList.get(i).name.equals(input)) {
				animalList.get(i).displayFullInfo();
			}else {
				System.out.println("Searching ... " + animalList.get(i).name);
			}
		}
		
		
	}


	private static void displayEnviormentList() {
		/* NTS look into changing environment to set of booleans so text cannot be
		 * mistaken
		 */
		
		System.out.println(" Which envioroment type would you like to list?"
				+"\n 1. deserts"
				+"\n 2. artic"
				+"\n 3. jungle"
				+"\n 4. forests");
		
		String input = imp.next();
		
		switch(input) {
		case "1" :
			for(int i=0; i < animalList.size(); i++) {
				if(animalList.get(i).animalEn == "Desert") {
					animalList.get(i).displayInfo();
				}
			}
			break;
		case "2" :
			for(int i=0; i < animalList.size(); i++) {
				if(animalList.get(i).animalEn == "Artic") {
					animalList.get(i).displayInfo();
				}
			}
			break;
		case "3" :
			for(int i=0; i < animalList.size(); i++) {
				if(animalList.get(i).animalEn == "Jungle") {
					animalList.get(i).displayInfo();
				}
			}
			break;
		case "4"	:
			for(int i=0; i < animalList.size(); i++) {
				if(animalList.get(i).animalEn == "Forest") {
					animalList.get(i).displayInfo();
				}
			}
			break;
		default:
			System.out.println("Invaild Input ...");
			break;
		}
		
		
	}


	private static void displayAnimalTypeList() {
		System.out.println(" Which animal type type would you like to list?"
				+"\n 1. Mammals "
				+"\n 2. Birds"
				+"\n 3. Fish"
				+"\n 4. Reptile");
		
		String input = imp.next();
		
		switch(input) {
		case "1" :
			for(int i=0; i < mammalList.size(); i++) {
				mammalList.get(i).displayInfo();
			}
			break;
		case "2" :
			for(int i=0; i < birdList.size(); i++) {
				birdList.get(i).displayInfo();
			}
			break;
		case "3" :
			for(int i=0; i < fishList.size(); i++) {
				fishList.get(i).displayInfo();
			}
			break;
		case "4" :
			for(int i=0; i < reptileList.size(); i++) {
				reptileList.get(i).displayInfo();
			}
		default :
			System.out.println("Sorry that is not a vaild input");
			break;
		}
		
	}



	private static void displayAnimalList() {
		
		for(int i=0; i < animalList.size(); i++) {
			animalList.get(i).displayInfo();
		}
		
	}



	private static void createAnimals() {
		
		//a few examples (not really correct information)....
		
		Mammal dog = new Mammal((mammalList.size()), "Dog", true, "dog food", "mans best friend", "Forest");
		animalList.add(dog);
		mammalList.add(dog);
		
		Mammal cat = new Mammal((mammalList.size()), "Cat", true, "cat food", "womans best friend", "Forest");
		animalList.add(cat);
		mammalList.add(cat);
		
		Bird pigeon = new Bird((birdList.size()), "Pigeon", false, "seeds", "nicks your chips", "Forest");
		animalList.add(pigeon);
		birdList.add(pigeon);
		
		Bird hawk = new Bird((birdList.size()), "Hawk", true, "small mammals", "scary, technically a mammal i think", "Jungle");
		animalList.add(hawk);
		birdList.add(hawk);
		
		Mammal kangaroo = new Mammal((mammalList.size()), "Kangaroo", false, "bush food", "hoppy", "Desert");
		animalList.add(kangaroo);
		mammalList.add(kangaroo);
		
		Mammal monkey = new Mammal((mammalList.size()), "Monkey", false, "berrys", "like us", "Jungle");
		animalList.add(monkey);
		mammalList.add(monkey);
		
		Reptile alligator = new Reptile((reptileList.size()), "Alligator", true, "mammals", "lurking in the swamp", "Jungle");
		animalList.add(alligator);
		reptileList.add(alligator);
		
		Fish siamese = new Fish((fishList.size()), "Siamese Figting Fish", false, "fish food", "looks colourful", "Jungle");
		animalList.add(siamese);
		fishList.add(siamese);
		
		Fish carp = new Fish((fishList.size()), "Common Carp", false, "plants", "we eat alot of then", "Forest");
		animalList.add(carp);
		fishList.add(carp);
		
		Reptile iguana = new Reptile((reptileList.size()), "Iguana", true, "small mammals", "looks like a dragon", "Jungle");
		animalList.add(iguana);
		reptileList.add(iguana);
		
		Mammal cammel = new Mammal((mammalList.size()), "Cammel", false, "plants", "has humps", "Desert");
		animalList.add(cammel);
		mammalList.add(cammel);
		
		
		
		
	}
	
	
	
	}


