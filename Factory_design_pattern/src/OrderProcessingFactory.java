import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class OrderProcessingFactory {

    private static final Map<OrderType, OrderFactory> ORDER_FACTORY_MAP = new HashMap<>();

    static {
        ORDER_FACTORY_MAP.put(OrderType.FOOD, new FoodOrderFactory());
        ORDER_FACTORY_MAP.put(OrderType.CLOTHING, new ClothingOrderFactory());
        ORDER_FACTORY_MAP.put(OrderType.ELECTRONICS, new ElectronicGadgetsOrderFactory());
        ORDER_FACTORY_MAP.put(OrderType.SHOES, new ShoesOrderFactory());
    }

    public static Order createOrder(OrderType orderType) {
        OrderFactory orderFactory = ORDER_FACTORY_MAP.get(orderType);
        if (orderFactory == null) {
            throw new IllegalArgumentException("Invalid order type: " + orderType);
        }
        return orderFactory.createOrder();
    }
}
