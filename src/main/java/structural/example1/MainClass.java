package structural.example1;

/**
 * @author Ramin Pakzad
 */
public class MainClass {
    public static void main(String[] args) {
        FlyweightFroductFactory flyweightFroductFactory=new FlyweightFroductFactory();
        Product apple = flyweightFroductFactory.getProduct("apple");
        System.out.println(apple);

    }
}
