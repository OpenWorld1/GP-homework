package strategy.ne;

import java.util.HashMap;
import java.util.Map;

public class NeTypeDeliverStrategy {
    public static final String WDMNE = "WDM";
    public static final String PTNNE = "PTN";
    public static final String SDHNE = "SDH";
    public static final String DEFAULTNE = "WDM";

    private static Map<String, NeTypeDeliver> deliverMap = new HashMap<String, NeTypeDeliver>();

    static{
        deliverMap.put(WDMNE, new WDMNeTypeDeliver());
        deliverMap.put(PTNNE, new PTNNeTypeDeliver());
        deliverMap.put(SDHNE, new SDHNeTypeDeliver());
    }


    public static NeTypeDeliver get(String deliverKey)
    {
        if(deliverMap.containsKey(deliverKey))
        {
            return deliverMap.get(deliverKey);
        }
        return deliverMap.get(DEFAULTNE);
    }


}
