package creational.abstractFactory.shape;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 3/29/2019.
 */
public class MainClass {
    public static void main(String[] args) {
        FactoryProvider.getFactory(Enums.FactoryType.ThreeDShape).getShape(Enums.ShapeType.Sphere).draw();

        FactoryProvider.getFactory(Enums.FactoryType.TwoDShape).getShape(Enums.ShapeType.Circle).draw();
    }
}
