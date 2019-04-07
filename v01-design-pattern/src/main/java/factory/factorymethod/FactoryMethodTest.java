package factory.factorymethod;

import factory.IInvest;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IInvestFactory factory = new FoundationInvestFactory();
        IInvest invest = factory.getInvest();
        invest.doInvest();
    }
}
