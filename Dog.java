public class Dog {
    // Create two fields for our Dog objects.

    private String name;
    private int age;

    // Create getters and setter for our felds.
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    // Create a constructor for the Dog objects that will be created with the "new" keyword.
    // A constructor is a special method that is called or involved when... the Dog class is used
    // to create an object.
    public Dog() {
        System.out.println("\nA dog object was created. This message is from the constructor.\n");
    }

    // Create a constructor that accepts a String data type for the Dog's name.
    public Dog(String myName) {
        this.name = myName;
    }

    // Create a constructor that accepts an argument when an object is created, this argument will
    // be an int
    public Dog(int theAge) {
        this.age = theAge;
    }

    // Create a constructor that accepts two arguments - a String for the name, and int for age.
    public Dog(String someName, int someAge) {
        this.name = someName;
        this.age = someAge;
    }
}
