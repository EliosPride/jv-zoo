package core.basesyntax;

import core.basesyntax.animals.*;
import core.basesyntax.aviary.Aquarium;
import core.basesyntax.aviary.Aviary;
import core.basesyntax.aviary.BirdAviary;
import core.basesyntax.aviary.LandAnimalAviary;

import java.util.List;

public class Main {



    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow("Vorobey");
        BirdAviary birdAviary = new BirdAviary(sparrow);

        Tiger tiger = new Tiger("Los'");
        LandAnimalAviary landAnimalsAviary = new LandAnimalAviary(tiger);
        tiger.eat();

        Penguin penguin = new Penguin("Borat");
        BirdAviary birdAviaryPenduin = new BirdAviary(penguin);

        Shark shark = new Shark("Vilka");
        Aquarium aquarium = new Aquarium(shark);

        Zoo zoo = new Zoo(List.of(birdAviary, landAnimalsAviary, birdAviaryPenduin, aquarium));

        for (Aviary<? extends Animal> aviary : zoo.getAviaries()) {
            aviary.getAnimal().eat();
        }
    }
}
