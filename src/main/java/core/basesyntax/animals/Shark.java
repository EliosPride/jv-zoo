package core.basesyntax.animals;

public class Shark extends Fish {

    public Shark(String petName) {
        super(petName);
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void eat() {
        System.out.println("Pet eats people!");
    }
}
