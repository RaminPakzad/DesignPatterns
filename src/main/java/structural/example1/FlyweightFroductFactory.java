package structural.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ramin Pakzad
 */
public class FlyweightFroductFactory {
    public Map<String, Product> map = new HashMap<>();

    public Product getProduct(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            map.put(name, new Product(name));
            return map.get(name);
        }
    }
}
