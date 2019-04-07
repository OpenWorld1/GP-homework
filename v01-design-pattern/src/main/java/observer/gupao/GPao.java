package observer.gupao;

import java.util.Observable;
import java.util.Observer;

public class GPao extends Observable {
    private String community = "咕泡生态圈";

    public void publishQuestion(Question q){
        System.out.println(community + "同学：" + q.gpName + "发布了一个问题");
        setChanged();
        notifyObservers(q);
    }
}
