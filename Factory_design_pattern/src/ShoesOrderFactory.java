public class ShoesOrderFactory implements OrderFactory {
    @Override
    public Order createOrder() {
        return new ShoesOrder();
    }
}