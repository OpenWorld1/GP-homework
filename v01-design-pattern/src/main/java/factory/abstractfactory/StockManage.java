package factory.abstractfactory;

public class StockManage implements IManage {
    @Override
    public void doManage() {
        System.out.println("股票管理");
    }
}
