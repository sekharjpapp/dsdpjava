package com.pixel.visitordesignpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SingleDispatch {
    // polymorphism
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        List<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(dog);
        myAnimals.add(cat);
        dog.makeSound();
        cat.makeSound();
    }
}
