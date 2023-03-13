public enum OrderType {
    FOOD(FOODOrderFactory.class),
    CLOTHING(CLOTHINGOrderFactory.class),
    ELECTRONICS(ELECTRONICSOrderFactory.class),
    SHOES(SHOESOrderFactory.class);
    private final Class<? extends OrderFactory> orderClass;

    OrderType(Class<? extends OrderFactory> orderClass) {
        this.orderClass = orderClass;
    }

    public OrderFactory getOrderClass() throws InstantiationException, IllegalAccessException {
        return orderClass.newInstance();
    }
}
