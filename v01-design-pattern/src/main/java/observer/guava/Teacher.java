package observer.guava;

import com.google.common.eventbus.Subscribe;

public class Teacher {
    public String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void dealQuestion(Question question){
        System.out.println(name + "老师处理学生：" + question.gpName + "的问题："
                + question.content);

    }
}
