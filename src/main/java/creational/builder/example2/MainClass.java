package creational.builder.example2;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/4/2019.
 */
public class MainClass {
    public static void main(String[] args) {
        Student student = new StudentBuilder().setId(1).setFirstName("Alfred").setLastName("Hickok").buildStudent();
        System.out.println(student);


    }
}
