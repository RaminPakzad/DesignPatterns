package creational.abstractFactory.shape;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/3/2019.
 */
public class ThreeDShapeFactory extends AbstractFactory {
    public GeometricShape getShape(Enums.ShapeType shapeType) {
        if (shapeType == Enums.ShapeType.Sphere) {
            return new Sphere();
        }
        return null;
    }
}
