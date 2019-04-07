package strategy.ne;

import strategy.DeliverResult;

public abstract class NeTypeDeliver {

    public abstract String getDeliverName();

    public DeliverResult deliverNeType(String uid, String num)
    {
        return new DeliverResult(200, "交付印度客户300套设备", "交易成功");
    }
}
