// aV 9/10/24
// App.java
//

import javax.swing.plaf.synth.SynthUI;
import java.awt.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to your first year of college!!");

//        Student myNewStudent = new Student();
//
//        myNewStudent.firstName = "Luke";
//        myNewStudent.lastName = "Yang";
//        myNewStudent.age = 21;
//        myNewStudent.gpa = 4.0;
//        myNewStudent.major = "engineering";
//        myNewStudent.onProbation = true;
//
//        // Output some stuff about our student
//        System.out.println("\nThe first name of our student is: " + myNewStudent.firstName + " " + myNewStudent.lastName);

        // Create two more students.
        Student anotherStudent = new Student();
        Student oneMoreStudent = new Student();

        oneMoreStudent.major = "Nursing";

        anotherStudent.major = "Biology";

        System.out.println("\nThere were " + Student.getNumOfStudents() + " Student object created!");

        //Create a phone object
        Phone myNewPhone = new Phone();

        myNewPhone.model = "iPhone";
        myNewPhone.numOfCameras = 3;

        System.out.println("\nMy new phone has " + myNewPhone.numOfCameras + " cameras!");

        // Create an array of Students
//         = new Student[100];

        String myObjectName = "";
        for (int i = 0; i < 100; i++){
            // Create 100 new Student objects
            // Create names for my object
            myObjectName = "StudentNumber" + i;
            // Create Student objects
            Student studentNum = new Student();
        }

        // Create 100 students with an ArrayList - a handy structure that is
        // flexible in size.

        ArrayList<Student> myStudentList = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            Student myNewStudent = new Student();
            myNewStudent.firstName = "some first name" + Integer.toString(i);
            myNewStudent.age = 99;
            myStudentList.add(myNewStudent);
        }

    }
}