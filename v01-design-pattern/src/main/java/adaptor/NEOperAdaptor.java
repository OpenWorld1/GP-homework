package adaptor;

import adaptor.ne.*;

public class NEOperAdaptor extends NECommunicate implements INEOperator
{
    public void commnuicateWDM(String id) {
        /*INEAdaptor adaptor = new WDMNEAdaptor();
        if(adaptor.support(adaptor))
        {
            adaptor.commnicate(id, adaptor);
        }*/
        processCommunicate(id, WDMNEAdaptor.class);
    }

    public void communicatePTN(String id) {
        processCommunicate(id, PTNNEAdaptor.class);
    }

    public void communicateSDH(String id) {
        processCommunicate(id, SDHNEAdaptor.class);
    }

    public void processCommunicate(String key, Class<? extends INEAdaptor> clazz)
    {
        try {
            INEAdaptor adaptor = clazz.newInstance();
            if(adaptor.support(adaptor))
            {
                adaptor.commnicate(key,adaptor);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void commnicate() {
        super.commnicate();
    }
}
