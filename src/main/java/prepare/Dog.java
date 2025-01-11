package prepare;

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void sound(String type) {
        System.out.println("Dog makes " + type + " sound");
    }
}
