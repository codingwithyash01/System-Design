package SingeltonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student st1 = Student.getInstance();
        Student st2 = Student.getInstance();
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st1==st2); // this will return true, that means we have single object here
    }
}

