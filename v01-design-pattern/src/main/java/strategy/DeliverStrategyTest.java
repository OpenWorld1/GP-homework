package strategy;

public class DeliverStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("印度客户", "20190330", "交付波分网元300套");
        order.deliver("WDM");

    }

}
