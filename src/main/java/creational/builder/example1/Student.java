package creational.builder.example1;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/4/2019.
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student build() {
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
