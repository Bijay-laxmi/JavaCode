package class_constructor;


	class Animal {
	    public void makeSound() {
	        System.out.println("The animal makes a sound.");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("The dog barks.");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("The cat meows.");
	    }
	}
	public class Animal7 {

	    public static void main(String[] args) {
	        Animal animal = new Animal();
	        Dog dog = new Dog();
	        Cat cat = new Cat();
	        
	        animal.makeSound();
	        dog.makeSound();
	        cat.makeSound();
	    }
	}


