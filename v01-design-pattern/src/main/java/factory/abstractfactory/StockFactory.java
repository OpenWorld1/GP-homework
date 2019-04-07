package factory.abstractfactory;

public class StockFactory implements AbstractInvestFactory {
    @Override
    public IInvest getInvest() {
        return new StockInvest();
    }

    @Override
    public IManage getManage() {
        return new StockManage();
    }
}
