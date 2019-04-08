package creational.builder.example3nested;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/4/2019.
 */
class Student {
    private final int id;
    private final String firstName;
    private final String lastName;

    private Student(final int id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static class StudentBuilder {
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
