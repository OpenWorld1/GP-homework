package strategy;


import strategy.ne.NeTypeDeliver;
import strategy.ne.NeTypeDeliverStrategy;

public class Order
{
    private String uid;
    private String orderId;
    private String agreement;

    public Order(String uid, String orderId, String agreement) {
        this.uid = uid;
        this.orderId = orderId;
        this.agreement = agreement;
    }

    public DeliverResult deliver(String deliverKey)
    {
        NeTypeDeliver deliver = NeTypeDeliverStrategy.get(deliverKey);
        return deliver.deliverNeType(uid, agreement);
    }



}
