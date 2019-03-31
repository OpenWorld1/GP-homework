package adaptor.ne;

public class SDHNEAdaptor implements INEAdaptor {
    public boolean support(Object adaptor) {
        return adaptor instanceof SDHNEAdaptor;
    }

    public void commnicate(String id, Object adaptor) {
        System.out.println("以太网元通讯");
    }
}
