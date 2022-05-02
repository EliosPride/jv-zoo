package core.basesyntax.animals;

import core.basesyntax.animalopportunities.Flyable;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        System.out.println("Pet eats corn!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
