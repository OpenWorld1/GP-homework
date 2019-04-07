package factory.factorymethod;

import factory.FoundationInvest;
import factory.IInvest;

public class FoundationInvestFactory implements IInvestFactory {
    @Override
    public IInvest getInvest() {
        return new FoundationInvest();
    }
}
