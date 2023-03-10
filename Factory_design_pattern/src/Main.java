public class Main {
    public static void main(String[] args) {
        Order foodOrder = OrderProcessingFactory.createOrder("food");
        foodOrder.processOrder();

        Order clothingOrder = OrderProcessingFactory.createOrder("clothing");
        clothingOrder.processOrder();
    }
}
