public class Main {
    public static void main(String[] args) {
        OrderProcessingFactory.registerOrderType(OrderType.SHOES, ShoesOrder.class);

        Order foodOrder = OrderProcessingFactory.createOrder(OrderType.FOOD);
        foodOrder.processOrder();

        Order clothingOrder = OrderProcessingFactory.createOrder(OrderType.CLOTHING);
        clothingOrder.processOrder();

        Order electronicsOrder = OrderProcessingFactory.createOrder(OrderType.ELECTRONICS);
        electronicsOrder.processOrder();

        Order shoesOrder = OrderProcessingFactory.createOrder(OrderType.SHOES);
        shoesOrder.processOrder();
    }
}
