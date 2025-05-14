package BuilderDesignPattern;

class Main {
    public static void main(String[] args) {
        Employee employee = Employee.builder().withName("Yash", "Verma")
                .withEmail("email@gmail.com")
                .withAge(24)
                .withPhoneNumber("123456789")
                .build();

        System.out.println("Name is: " + employee.getFirstName() +" " + employee.getLastName());
        System.out.println("Age is: "+ employee.getAge());
    }
}
