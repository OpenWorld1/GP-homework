package factory.factorymethod;

import factory.IInvest;
import factory.StockInvest;

public class StockInvestFactory implements IInvestFactory{
    @Override
    public IInvest getInvest() {
        return new StockInvest();
    }
}
