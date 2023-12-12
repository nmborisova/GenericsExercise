package bg.smg;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog();
        Cat cat = new Cat();
        Frog frog = new Frog();

        AnimalHouse<Animal> animalHouse = new AnimalHouse<>();
        animalHouse.animal = cat;
        animalHouse.animal = dog;
        System.out.println(animalHouse.animal);
        animalHouse.animal = frog;

        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();
        dogHouse.animal=dog;

        AnimalHouse<Frog> frogHouse = new AnimalHouse<>();
        frogHouse.animal=frog;

        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        catHouse.animal=cat;
    }
}
