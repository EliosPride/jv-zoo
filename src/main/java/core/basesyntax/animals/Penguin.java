package core.basesyntax.animals;

import core.basesyntax.animalopportunities.Swimable;

public class Penguin extends Bird implements Swimable {

    public Penguin(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        System.out.println("Pet eats fish!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}
