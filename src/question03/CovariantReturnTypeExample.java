package question03;


class Animal {
    Animal getAnimal() {
        System.out.println("Animal");
        return this;
    }
}

class Dog extends Animal {
    Dog getAnimal() { // Covariant return type
        System.out.println("Dog");
        return this;
    }
}

public class CovariantReturnTypeExample {

	public static void main(String[] args) {
		Animal animal = new Animal();
        animal.getAnimal(); // Output: Animal

        Dog dog = new Dog();
        dog.getAnimal(); // Output: Dog

        Animal animal2 = new Dog();
        animal2.getAnimal(); // Output: Dog

	}

}
