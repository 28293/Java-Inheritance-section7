package org.animal;

public class Cat extends Animal {

    private void meow() {
        System.out.println("Cat '" + getId() + "' is making meow sound");
    }

    public void sound() {
        meow();
    }
}

