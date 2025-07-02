interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Cooking");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Serving");
    }
}
public class RestaurantManagement {
    public static void main(String[] args) {
        Worker chef = new Chef("John", 1);
        Worker waiter = new Waiter("Prachi", 2);

        System.out.println("Chef: " + chef.getClass().getSimpleName() + ", Name: " + ((Person) chef).name + ", ID: " + ((Person) chef).id);
        chef.performDuties(); // Output: Cooking

        System.out.println("Waiter: " + waiter.getClass().getSimpleName() + ", Name: " + ((Person) waiter).name + ", ID: " + ((Person) waiter).id);
        waiter.performDuties(); // Output: Serving
    }
}