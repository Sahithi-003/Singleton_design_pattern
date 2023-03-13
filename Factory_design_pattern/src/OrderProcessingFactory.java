public class OrderProcessingFactory {
public static OrderFactory createOrder(OrderType orderType) throws InstantiationException, IllegalAccessException {
    return orderType.getOrderClass();
}

}
