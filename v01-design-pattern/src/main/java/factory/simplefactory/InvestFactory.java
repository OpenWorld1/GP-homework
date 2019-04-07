package factory.simplefactory;

import factory.IInvest;

public class InvestFactory {

    public IInvest createInvest(Class<? extends IInvest> clazz){
        if(null != clazz || !"".equals(clazz)){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
