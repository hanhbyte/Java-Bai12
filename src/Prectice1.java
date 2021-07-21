import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Prectice1 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nam",30);
        hashMap.put("Van", 30);
        hashMap.put("Cuong", 30);
        hashMap.put("Binh", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Nam", 30);
        linkedHashMap.put("Van", 30);
        linkedHashMap.put("Cuong", 30);
        linkedHashMap.put("Binh", 29);
        System.out.println("\n The age for " + " Cuong is " + linkedHashMap.get("Cuong"));
    }
}