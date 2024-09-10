public class Student {
    private static int numOfStudents = 0;

    // Create a constructor for out new object
    public Student() {
        numOfStudents ++;
    }
    public static int getNumOfStudents(){
        return numOfStudents;
    }

    // Give our Student class a few fields
    String firstName;
    String lastName;
    int age;
    String major;
    double gpa;
    boolean onProbation;


}
