package prototype;

import java.util.Date;

public class PrototypeTest {
    public static void main(String[] args) {
        StudentWithArt stu = new StudentWithArt();
        stu.setName("kobe");
        stu.setAge(18);
        stu.setBirth(new Date());
        stu.setStuId(1101);
        stu.setAddress("洛杉矶");

        try {
            StudentWithArt copy = (StudentWithArt) stu.clone();
            System.out.println("深克隆地址：" + (copy.draw == stu.draw));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        StudentWithArt stu2 = new StudentWithArt();
        StudentWithArt copy2 = stu2.shallowClone(stu2);
        System.out.println("浅克隆地址：" + (copy2.draw == stu2.draw));
    }
}
