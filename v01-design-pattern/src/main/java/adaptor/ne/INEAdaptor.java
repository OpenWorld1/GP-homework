package adaptor.ne;

/**
 * 网元适配器接口
 */
public interface INEAdaptor {

    boolean support(Object adaptor);

    //网元设备间通讯
    void commnicate(String id, Object adaptor);
}
