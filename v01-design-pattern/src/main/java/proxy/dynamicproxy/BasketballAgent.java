package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BasketballAgent implements InvocationHandler {
    private BasketballPlayer target = null;

    public Object getInstance(BasketballPlayer player){
        this.target = player;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(target, args);
        after();
        return obj;
    }

    public void before(){
        System.out.println("找好签约球队");
    }

    public void after(){
        System.out.println("为球队效力");
    }
}
