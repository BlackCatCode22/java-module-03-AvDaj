package mystudent;

public class Student {
    public static void sayHello() {
        System.out.println("\nHello from the Student Class! I am a static method" +
                " and I belong to the Student Class!\n");
    }

    public void sayHi(){
        System.out.println("\nHi there I must be from the an object because I am not static!\n");
    }


}
