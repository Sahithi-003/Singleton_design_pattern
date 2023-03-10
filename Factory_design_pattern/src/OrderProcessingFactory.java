public class OrderProcessingFactory {
    public static Order createOrder(String orderType) {
        if (orderType.equalsIgnoreCase("food")) {
            return new FoodOrder();
        } else if (orderType.equalsIgnoreCase("clothing")) {
            return new ClothingOrder();
        } else if (orderType.equalsIgnoreCase("electronics")) {
            return new ElectronicGadgetsOrder();
        }else {
            throw new IllegalArgumentException("Invalid order type");
        }
    }
}
