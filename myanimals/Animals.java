package myanimals;

public class Animals {
    // There is not a "static" keyword here, so... this method
    // will be available to Animal objects.

    // Create a static member names numOfAnimals
    public static int numOfAnimals = 0;

    // Create a constructor
    public Animals() {
        numOfAnimals++;
    }


    public void animalSounds() {
        System.out.println("\nA sound from the Animals Class.");
    }
}
