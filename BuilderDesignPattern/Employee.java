package BuilderDesignPattern;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


// Step-1: Hide the constructor by making it private

    private Employee() {
    }

    public static Builder builder() {
        return new Builder();
    }

    // Step-2: Create a nested builder/friend class

    public static class Builder {

        // Step-3: Copy all the attributes from the outer class to inner class

        private String firstName;
        private String lastName;
        private int age;
        private String phoneNumber;
        private String email;

        // Step-4 Expose the setters, and here we have used fluent interface, that will help us in method chaining

        public Builder withName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        // step-5: Add the build hook
        public Employee build() {
            if (!isValid()) {
                throw new IllegalArgumentException("First name and last name are required");
            }
            Employee employee = new Employee();
            employee.firstName = firstName;
            employee.lastName = lastName;
            employee.email = email;
            employee.phoneNumber = phoneNumber;
            employee.age = age;

            return employee;
        }

        // We can do complex validations like this

        public boolean isValid() {
            return firstName != null && lastName != null;
        }
    }
}
