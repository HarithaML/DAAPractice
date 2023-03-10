package com.dataStructures.stacks.problems.animalShelter;

import com.dataStructures.stacks.problems.animalShelter.datastructures.Animal;
import com.dataStructures.stacks.problems.animalShelter.datastructures.AnimalType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalShelter {
    private static final Logger logger = LoggerFactory.getLogger(AnimalShelter.class);

    LinkedList<Animal> animals ;
    LinkedList<Animal> dogs;
    LinkedList<Animal> cats;

    public AnimalShelter() {
        this.animals = new LinkedList<>();
        this.dogs = new LinkedList<>();
        this.cats = new LinkedList<>();
    }

    public void enqueue(int age, AnimalType animalType){
        Animal animal = new Animal(age, animalType);
        this.animals.add(animal);
    }
    public Optional<Animal> dequeueAny(){
      return dequeue(animals);
    }

    public Optional<Animal> dequeueDog(){
        dogs = getDogs();
        return dequeue(dogs);
    }
    public Optional<Animal> dequeueCat(){
        cats = getCats();
        return dequeue(cats);
    }



    //private functions

    public LinkedList<Animal> getDogs(){
        return animals.stream()
                .filter(i -> i.animalType() == AnimalType.DOG)
                .collect(Collectors.toCollection(LinkedList::new));
    }


    public LinkedList<Animal> getCats(){
        return animals.stream()
                .filter(i -> i.animalType() == AnimalType.CAT)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public Optional<Animal> dequeue(LinkedList<Animal> list){
        //find max age
        int max = list.get(0).age();
        for (Animal value : list) {
            if (max < value.age()) {
                max = value.age();
            }
        }
        for (Animal value : list) {
            if (max == value.age()) {
                remove(value.age(),value.animalType());
                return Optional.of(value);
            }
        }

        logger.error("Cat with max age not found");
        return Optional.empty();

    }

    public void remove(int age,AnimalType type){
        for(int i = 0;i<animals.size();i++){
            if(animals.get(i).age()==age&& animals.get(i).animalType()==type){
                animals.remove(i);
            }
        }
    }
}

