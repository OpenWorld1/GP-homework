package factory.simplefactory;

import factory.IInvest;
import factory.StockInvest;

public class InvestFactoryTest {
    public static void main(String[] args) {
        InvestFactory factory = new InvestFactory();
        IInvest invest = factory.createInvest(StockInvest.class);
        invest.doInvest();
    }
}
