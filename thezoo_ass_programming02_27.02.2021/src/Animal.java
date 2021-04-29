
public class Animal {
	
	int animalId;
	String name;
	double avWeight;
	double avHeight;
	boolean ifCarnivore;
	String foodType;
	String description;
	String animalEn;
	
	Animal(int animalId, String name, boolean ifCarnivore, String foodType,
		String description, String animalEn){
		this.animalId = animalId;
		this.name = name;
		this.ifCarnivore = ifCarnivore;
		this.foodType = foodType;
		this.description = description;
		this.animalEn = animalEn;
	}
	
	
	// will display animal name and id ...
	void displayInfo(){
		System.out.println(" ---------------------------- \n"
				+ " Animal ID = " + animalId
				+ "\n Name = " + name
				+ "\n ---------------------------- ");
	}

	void displayFullInfo(){
		System.out.println(" ---------------------------- \n"
				+ " Animal ID = " + animalId
				+ "\n Name = " + name
				+ "\n IfCarnivore " + ifCarnivore 
				+ "\n FoodType " + foodType
				+ "\n Description " + description
				+ "\n Animals Enviorment" + animalEn
				+ "\n ----------------------------");
	}
}

class Mammal extends Animal {

	
	
	
	
	Mammal(int animalId, String name, boolean ifCarnivore, String foodType, String description, String animalEn) {
		super(animalId, name, ifCarnivore, foodType, description, animalEn);
	}

	void desplayInfo(){
		System.out.println(" ---------------------------- \n"
				+ " Animal ID = " + animalId
				+ "\n Name = " + name
				+ "\n If Carnivore = " + ifCarnivore 
				+ "\n FoodType = " + foodType
				+ "\n description = " + description
				+ "\n ---------------------------- ");
	}
	
}

class Bird extends Animal {

	
	
	
		
	Bird(int animalId, String name, boolean ifCarnivore, String foodType, String description, String animalEn) {
		super(animalId, name, ifCarnivore, foodType, description, animalEn);
	}

	
	void desplayInfo(){
		System.out.println(" ---------------------------- \n"
				+ " Animal ID = " + animalId
				+ "\n Name = " + name
				+ "\n If Carnivore = " + ifCarnivore 
				+ "\n FoodType = " + foodType
				+ "\n description = " + description
				+ "\n ---------------------------- ");
	}
	
}

class Fish extends Animal {

	
	
	

	Fish(int animalId, String name, boolean ifCarnivore, String foodType, String description, String animalEn) {
		super(animalId, name, ifCarnivore, foodType, description, animalEn);
	}


	void desplayInfo(){
		System.out.println(" ---------------------------- \n"
				+ " Animal ID = " + animalId
				+ "\n Name = " + name
				+ "\n If Carnivore = " + ifCarnivore 
				+ "\n FoodType = " + foodType
				+ "\n description = " + description
				+ "\n ---------------------------- ");
	}
	
}

class Reptile extends Animal {

	
	
	
		
	Reptile(int animalId, String name, boolean ifCarnivore, String foodType, String description, String animalEn) {
		super(animalId, name, ifCarnivore, foodType, description, animalEn);
	}


	void desplayInfo(){
		System.out.println(" ---------------------------- \n"
				+ " Animal ID = " + animalId
				+ "\n Name = " + name
				+ "\n If Carnivore = " + ifCarnivore 
				+ "\n FoodType = " + foodType
				+ "\n description = " + description
				+ "\n ---------------------------- ");
	}
	
}