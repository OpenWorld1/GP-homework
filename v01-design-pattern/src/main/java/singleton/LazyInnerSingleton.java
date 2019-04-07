package singleton;

public class LazyInnerSingleton {

    private  LazyInnerSingleton()
    {
        if(InnerSingleton.LAZY != null)
        {
            throw new RuntimeException("不允许创建多个对象");
        }
    }
    public static LazyInnerSingleton getInstance()
    {
        return InnerSingleton.LAZY;
    }

    static class InnerSingleton
    {
        private static final LazyInnerSingleton LAZY = new LazyInnerSingleton();
    }

}
