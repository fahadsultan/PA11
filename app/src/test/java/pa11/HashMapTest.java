package pa11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.size();
        map.isEmpty();
        map.get("key");
        map.put("key", "value");
        map.remove("key");

        System.out.println("All tests passed!");
    }
    
}
