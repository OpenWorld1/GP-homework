package adaptor.ne;

public class WDMNEAdaptor implements INEAdaptor {
    public boolean support(Object adaptor) {
        return adaptor instanceof WDMNEAdaptor;
    }

    public void queryData() {

    }

    public void commnicate(String id, Object adaptor) {
        System.out.println("波分网元通讯");
    }
}
