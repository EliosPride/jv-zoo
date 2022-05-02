package core.basesyntax.animals;

public class Tiger extends LandAnimal {

    public Tiger(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        System.out.println("Pet eats meat!");
    }
}
