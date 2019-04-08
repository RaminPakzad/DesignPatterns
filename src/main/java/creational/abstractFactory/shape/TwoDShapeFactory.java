package creational.abstractFactory.shape;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/3/2019.
 */
public class TwoDShapeFactory extends AbstractFactory {
    public GeometricShape getShape(Enums.ShapeType shapeType) {
        if (shapeType == Enums.ShapeType.Circle) {
            return new Circle();
        } else if (shapeType == Enums.ShapeType.Line) {
            return new Line();
        }
        return null;
    }
}
