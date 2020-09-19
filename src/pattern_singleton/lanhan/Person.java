package pattern_singleton.lanhan;

/**
 * Create by SunnyDay on 2019/04/08
 */
public class Person {
    private volatile static Person person;

    private Person() {
    }

    public static Person getInstance() {
        if (null == person) {
            synchronized (Person.class) {
                if (null == person) {
                    person = new Person();
                }
            }
        }
        return person;
    }
}
