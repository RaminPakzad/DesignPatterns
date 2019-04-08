package creational.builder.example2;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/4/2019.
 */
public class StudentBuilder {
    private int id;
    private String firstName;
    private String lastName;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student buildStudent() {
        return new Student(this.id, this.firstName, this.lastName);
    }

}
