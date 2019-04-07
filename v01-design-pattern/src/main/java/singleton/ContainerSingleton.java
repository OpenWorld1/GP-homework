package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private static Map map = new ConcurrentHashMap<String,Object>();
    private ContainerSingleton(){}

    public static Object getInstance(String className)
    {
        synchronized (ContainerSingleton.class)
        {
            if(!map.containsKey(className))
            {
                try {
                    Class<?> clazz = Class.forName(className);
                    Constructor con = clazz.getDeclaredConstructor(null);
                    con.setAccessible(true);
                    Object obj = con.newInstance();
                    map.put(className,obj);
                    return obj;
                } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        return map.get(className);
    }


}
