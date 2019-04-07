package observer.gupao;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

    public String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPao gp = (GPao) o;
        Question q = (Question) arg;
        System.out.println(name + "老师您好！" + q.gpName + "同学在咕泡社区" + "发布了一个问题：" + q.content);



    }
}
