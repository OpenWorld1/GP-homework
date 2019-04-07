package prototype;

import java.io.*;
import java.util.Date;

/**
 * 艺术特长生
 */
public class StudentWithArt extends Student implements Cloneable,Serializable {
    public Draw draw;

    public StudentWithArt() {
        this.birth = new Date();
        this.draw = new Draw();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public StudentWithArt deepClone()
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream input = new ObjectInputStream(bis);

            StudentWithArt copy = (StudentWithArt) input.readObject();
            copy.draw = new Draw();
            return copy;

        } catch (Exception e) {
           return null;
        }
    }

    public StudentWithArt shallowClone(StudentWithArt target)
    {
        StudentWithArt stu = new StudentWithArt();
        stu.stuId = target.stuId;
        stu.address = target.address;
        stu.age = target.age;
        stu.name = target.name;
        stu.birth = target.birth;
        stu.draw = target.draw;
        return stu;
    }
}
