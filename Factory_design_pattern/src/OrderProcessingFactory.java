import java.lang.reflect.InvocationTargetException;

public class OrderProcessingFactory {
public static OrderFactory createOrder(OrderType orderType) {
    String className = orderType.name() + "OrderFactory";
    try {
        Class<?> clazz = Class.forName(className);
        return (OrderFactory) clazz.getDeclaredConstructor().newInstance();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException  e) {
        throw new IllegalArgumentException("Unsupported food type: " + orderType.name(), e);
    } catch (InvocationTargetException e) {
        throw new RuntimeException(e);
    }
}


}
