package creational.abstractFactory.shape;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/3/2019.
 */
public abstract class AbstractFactory {
    public abstract GeometricShape getShape(Enums.ShapeType shapeType);
}
