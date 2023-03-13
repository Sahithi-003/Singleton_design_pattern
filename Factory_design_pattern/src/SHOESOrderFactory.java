public class SHOESOrderFactory implements OrderFactory {
    @Override
    public void createOrder() {
        System.out.println("Processing Shoes!!!");
    }
}