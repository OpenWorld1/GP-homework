package singleton;

import java.io.Serializable;

public class SerialSingleton implements Serializable {
    private final static SerialSingleton serialSingleton = new SerialSingleton();

    private SerialSingleton(){}

    public static SerialSingleton getInstance()
    {
        return serialSingleton;
    }

    public Object readResolve()
    {
        return serialSingleton;
    }

}
