public class FOODOrderFactory implements OrderFactory{
    @Override
    public void createOrder() {
        System.out.println("Processing food!!!");
    }
}
