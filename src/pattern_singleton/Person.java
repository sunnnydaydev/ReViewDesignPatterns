package pattern_singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Create by SunnyDay on 2019/04/08
 */
public class Person implements Serializable {
    // 单利设计模式  静态内部类单利 （推荐使用）
    private Person() {
        throw new RuntimeException("SingleTon can't be reflected");
    }

     private static class Holder {
        private static Person INSTANCE = new Person();
    }

    public static Person getInstance() {
        return Holder.INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return Holder.INSTANCE;
    }
}
