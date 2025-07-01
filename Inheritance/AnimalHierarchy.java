class Animal {
    String name;
    int age;



    void makeSound() {}
}

class Dog extends Animal {
   
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Chirp");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myBird = new Bird();

        myDog.makeSound(); // Output: Bark
        myCat.makeSound(); // Output: Meow
        myBird.makeSound(); // Output: Chirp
    }
}