package observer.gupao;

public class GPaoTest {

    public static void main(String[] args) {

        Question q = new Question("大白", "观察者模式适用那些场景？");
        GPao gp = new GPao();
        Teacher teacher = new Teacher("Tom");
        gp.addObserver(teacher);
        gp.publishQuestion(q);
    }
}
