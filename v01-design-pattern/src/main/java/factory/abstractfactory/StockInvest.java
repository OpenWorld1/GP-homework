package factory.abstractfactory;

public class StockInvest implements IInvest {
    @Override
    public void doInvest() {
        System.out.println("股票投资");;
    }
}
