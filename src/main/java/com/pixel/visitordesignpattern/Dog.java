package com.pixel.visitordesignpattern;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
