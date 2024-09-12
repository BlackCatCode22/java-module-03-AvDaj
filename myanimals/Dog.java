package myanimals;

public class Dog extends Animals {
    // The Dog class is a subclass of Animal.
    // so it should have all the methods from the
    // Animal class available to it.

    //This is polymorphism - this word means "many shapes"
    // when used here, by a Dog object, this method that has the same name
    // as the method in the superclass, takes another shape.

    public void animalSounds() {
        System.out.println("\nA sound form the Dog class used by a Dog Object - Woof.");
    }

}
