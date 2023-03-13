public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        OrderFactory foodFactory = OrderProcessingFactory.createOrder(OrderType.FOOD);
        foodFactory.createOrder();
        OrderFactory electronicsFactory = OrderProcessingFactory.createOrder(OrderType.ELECTRONICS);
        electronicsFactory.createOrder();
        OrderFactory clothingFactory = OrderProcessingFactory.createOrder(OrderType.CLOTHING);
        clothingFactory.createOrder();
        OrderFactory shoeFactory = OrderProcessingFactory.createOrder(OrderType.SHOES);
        shoeFactory.createOrder();
    }
}
