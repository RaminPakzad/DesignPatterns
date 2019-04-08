package creational.builder.example3nested;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/4/2019.
 */
public class MainClass {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().setId(1).setFirstName("ali").setLastName("mansor").buildStudent();
        System.out.println(student);
    }
}
