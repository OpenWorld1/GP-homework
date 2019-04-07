package factory.abstractfactory;

public class FoundationFactory implements AbstractInvestFactory {
    @Override
    public IInvest getInvest() {
        return null;
    }

    @Override
    public IManage getManage() {
        return null;
    }
}
