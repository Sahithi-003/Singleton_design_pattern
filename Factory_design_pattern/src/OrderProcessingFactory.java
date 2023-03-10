import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class OrderProcessingFactory {

    private static final Map<OrderType, Class<? extends Order>> orderTypeToClassMap = new HashMap<>();

    static {
        orderTypeToClassMap.put(OrderType.FOOD, FoodOrder.class);
        orderTypeToClassMap.put(OrderType.CLOTHING, ClothingOrder.class);
        orderTypeToClassMap.put(OrderType.ELECTRONICS, ElectronicGadgetsOrder.class);
    }

    public static void registerOrderType(OrderType orderType, Class<? extends Order> orderClass) {
        orderTypeToClassMap.put(orderType, orderClass);
    }

    public static Order createOrder(OrderType orderType) {
        try {
            Class<? extends Order> orderClass = orderTypeToClassMap.get(orderType);
            if (orderClass == null) {
                throw new IllegalArgumentException("Invalid order type: " + orderType);
            }
            Constructor<? extends Order> constructor = orderClass.getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create order", e);
        }
    }
}
