package SingeltonDesignPattern;

/*
 What is Singleton Design Pattern???

 The Singleton design pattern ensures that a class have only one instance throughout the entire application and
 provide a global point of access to that instance.

 When to use Singelton ???

 Use it when:
 1) You need only and only one instance
 2) The instance needs to be globally accessible

 example: Logger, Database connection, Configuration class
 
*/

public class Student {

    // Creating a private static instance
    private static Student instance;

    // creating a private constructor so no one else can use it
    private Student(){}

    // Creating a public method to return the same instance
    public static Student getInstance(){
        if(instance ==null){
            synchronized(Student.class){
                if(instance==null){
                    instance = new Student();
                }
            }
        }
        return instance;
    }
}
