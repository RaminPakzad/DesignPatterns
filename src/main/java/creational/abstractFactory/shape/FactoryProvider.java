package creational.abstractFactory.shape;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 4/3/2019.
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(Enums.FactoryType factoryType) {
        if (factoryType == Enums.FactoryType.ThreeDShape) {
            return new ThreeDShapeFactory();
        } else if (factoryType == Enums.FactoryType.TwoDShape) {
            return new TwoDShapeFactory();
        }
        return null;
    }

}
