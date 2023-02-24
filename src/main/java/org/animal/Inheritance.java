package org.animal;

public class Inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setId(123);
        dog.sound();

        Animal cat = new Cat();
        cat.setId(345);
        cat.sound();
    }
    }
