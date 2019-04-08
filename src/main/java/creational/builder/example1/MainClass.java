package creational.builder.example1;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/4/2019.
 */
public class MainClass {
    public static void main(String[] args) {
        Student s = new Student().setId(1).setFirstName("reza").setLastName("mosavi");
        System.out.println(s);

    }
}
