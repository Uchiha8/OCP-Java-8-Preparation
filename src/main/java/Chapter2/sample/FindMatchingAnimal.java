package Chapter2.sample;

public class FindMatchingAnimal {
    private static void print(Animal a, CheckTrait trait) {
        if (trait.test(a)) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("Kangaroo", true, false), a -> a.canSwim());

    }
}
