package prepare;

public class VirtualMethodOverloading {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        animal.sound("growl");
    }
}
