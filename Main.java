// aV 9/12/24
//
// Main.java
//
import myanimals.Animals;
import myanimals.Cat;
import myanimals.Dog;
import mystudent.Student;
import mystudent.App;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome from the Main!!\n");

        // Create a Student object.
        Student student = new Student();

        // Create an object from a runnable class.
        App app = new App();

        // Use a method from the Student Class.
        // I know that I have a static method on the Student Class
        // and, I know how to call a static class method
        Student.sayHello();

        // Call a method that belongs to the student object.
        student.sayHi();

        // Output numbers of animals
        System.out.println("\nThe number of animals is: " + Animals.numOfAnimals);

        // Create a Cat object.
        Cat cat = new Cat();

        // Create a Dog object
        Dog dog = new Dog();

        // Use a method that is available to the Cat object named cat
        System.out.println("\nThis sound is coming from the Cat object named cat...");
        cat.animalSounds();

        // Use a method that is available to the Dog object named cat
        System.out.println("\nThis sound is coming from the Dog object named dog...");
        dog.animalSounds();

        // Output numbers of animals
        System.out.println("\nThe number of animals is: " + Animals.numOfAnimals);

    }
}