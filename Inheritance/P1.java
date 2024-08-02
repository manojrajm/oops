class Animal {
    private String name;     
    private int age;        
    private String species;  
    
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void displayAnimalDetails() {
        System.out.printf("Name: %s%nAge: %d%nSpecies: %s%n", 
                          name, age, species);
    }
}

class Dog extends Animal {
    private String breed;  
    private String color;  
    public Dog(String name, int age, String species, String breed, String color) {
        super(name, age, species); 
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void displayAnimalDetails() {
        super.displayAnimalDetails(); 
        System.out.printf("Breed: %s%nColor: %s%n", breed, color); 
    }
}

public class P1{
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal", 5, "Mammal");
        genericAnimal.displayAnimalDetails();
        Dog myDog = new Dog("Buddy", 3, "Dog", "Golden Retriever", "Golden");
        System.out.println("\nDog Details:");
        myDog.displayAnimalDetails();
    }
}

