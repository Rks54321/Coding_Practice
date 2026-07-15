package Map;
import java.util.Map;
import java.util.LinkedHashMap;
public class EntrySet {
    static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("apple", 100);
        map.put("banana", 200);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
