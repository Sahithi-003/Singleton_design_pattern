public class ElectronicGadgetsOrderFactory implements OrderFactory{
    @Override
    public Order createOrder() {
        return new ElectronicGadgetsOrder();
    }
}