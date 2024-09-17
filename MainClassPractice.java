// aV 9/17/24
// MainClassPractice.java

public class MainClassPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my OOP Class Practice Program!\n");

        // Create a couple Dog objects
        // with an empty argument ("no args")
        Dog myDog = new Dog();
        Dog anotherDog = new Dog();

        // Create a dog with a String name
        Dog aDog = new Dog("Loki");

        // Output the new Dog object's name.
        System.out.println("\nThe new dog is: " + aDog.getName());

        // Create a fourth dog with an int age.
        Dog fourthDog = new Dog(1);

        // Output the dog's age.
        System.out.println("\nMy new dog's age is: " + fourthDog.getAge());

        // And... finally create a fifth and last dog...
        Dog fifthDog = new Dog("Loki", 1);
        System.out.println("\nMy new dogs name is: " + fifthDog.getName() + " and his age is: " + fifthDog.getAge());
    }
}



