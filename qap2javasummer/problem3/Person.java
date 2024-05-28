public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor to initialize Person
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    // ToString method
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
