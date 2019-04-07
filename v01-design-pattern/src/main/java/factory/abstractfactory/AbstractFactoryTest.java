package factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractInvestFactory factory = new StockFactory();
        IInvest invest = factory.getInvest();
        IManage manage = factory.getManage();
        invest.doInvest();
        manage.doManage();
    }
}
