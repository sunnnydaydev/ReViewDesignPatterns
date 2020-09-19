package pattern_singleton;

import java.io.*;

/**
 * Create by SunnyDay on 2019/04/08
 */
public class Test {
    public static void main(String[] args) {
        try {
            ObjectOutputStream
                    oos = new ObjectOutputStream(new FileOutputStream("test.txt"));//输出到当前根目录下，无文件自动创建。
            oos.writeObject(Person.getInstance());
            //Read Obj from file
            File file = new File("test.txt");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Person person = (Person) ois.readObject();
            //判断是否是同一个对象
            System.out.println(person == Person.getInstance());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
