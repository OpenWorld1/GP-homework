package adaptor;

public class NETest {
    public static void main(String[] args) {
        INEOperator oper = new NEOperAdaptor();
        oper.commnuicateWDM("wdm");
    }
}
