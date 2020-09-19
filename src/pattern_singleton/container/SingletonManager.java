package pattern_singleton.container;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by SunnyDay on 2020/09/17
 */
public class SingletonManager {
    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonManager() {
    }

    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public Object getService(String key) {
        return objectMap.get(key);
    }
}
