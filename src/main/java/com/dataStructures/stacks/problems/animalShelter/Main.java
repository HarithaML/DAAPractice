package com.dataStructures.stacks.problems.animalShelter;

import com.dataStructures.stacks.problems.animalShelter.datastructures.Animal;
import com.dataStructures.stacks.problems.animalShelter.datastructures.AnimalType;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter();
        Animal animal = new Animal(10, AnimalType.DOG);
        animalShelter.enqueue(5, AnimalType.CAT);
        animalShelter.enqueue(5, AnimalType.DOG);
        animalShelter.enqueue(15, AnimalType.DOG);
        animalShelter.enqueue(6, AnimalType.CAT);
        animalShelter.enqueue(11, AnimalType.DOG);
        animalShelter.enqueue(2, AnimalType.CAT);
        animalShelter.enqueue(4, AnimalType.DOG);
        animalShelter.enqueue(8, AnimalType.CAT);
        animalShelter.enqueue(9, AnimalType.DOG);

        Optional<Animal> animal1 = animalShelter.dequeueAny();
        display(animal1);

        Optional<Animal> animal2 = animalShelter.dequeueDog();
        display(animal2);

        Optional<Animal> animal3 = animalShelter.dequeueCat();
        display(animal3);

        Optional<Animal> animal4 = animalShelter.dequeueAny();
        display(animal4);

        Optional<Animal> animal5 = animalShelter.dequeueDog();
        display(animal5);

        Optional<Animal> animal6 = animalShelter.dequeueCat();
        display(animal6);



    }

    public static void display(Optional<Animal> animalOpt) {
        if (animalOpt.isPresent()) {
            Animal a = animalOpt.get();
            String result = String.format(a.animalType()+ " Found With Age "+a.age());
            logger.info(result);
        } else {
            logger.error("NO animal found");
        }
    }
}
