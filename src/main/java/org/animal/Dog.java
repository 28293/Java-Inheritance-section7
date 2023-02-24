package org.animal;

public class Dog extends Animal {
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    public void sound() {
        bark();
    }
}
