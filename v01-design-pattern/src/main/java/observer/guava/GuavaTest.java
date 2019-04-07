package observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaTest {
    public static void main(String[] args) {
        EventBus bus = new EventBus();
        Question question = new Question("白白", "学习设计模式有什么用处？");
        Teacher teacher = new Teacher("Tom");
        //注册监听者：Tom老师，当有事件发生时，调用老师的事件处理方法
        bus.register(teacher);
        //触发事件：问题
        bus.post(question);
    }
}
