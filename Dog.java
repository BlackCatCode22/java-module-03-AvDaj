public class Dog {
    private static int numOfDogs = 0;

    // Create a constructor for out new object
    public Dog() {
        numOfDogs ++;
    }
    public static int getNumOfDogs(){
        return numOfDogs;
    }

    String name;

}
