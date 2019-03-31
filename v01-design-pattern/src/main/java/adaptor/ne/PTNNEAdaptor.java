package adaptor.ne;

public class PTNNEAdaptor implements INEAdaptor {
    public boolean support(Object adaptor) {
        return adaptor instanceof PTNNEAdaptor;
    }

    public void commnicate(String id, Object adaptor) {
        System.out.println("数据网元通讯");
    }
}
