package proxy.dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicProxyTest {
    public static void main(String[] args) {
        BasketballAgent agent = new BasketballAgent();
        Object obj = agent.getInstance(new BasketballPlayer());
        try {
            Method method = obj.getClass().getMethod("doAgreement", null);
            method.invoke(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
