import java.util.SortedMap;
import java.util.TreeMap;

public class App {
  public static void main(String[] args) throws Exception {
    SortedMap<Integer, String> namesMap = new TreeMap<Integer, String>();

    namesMap.put(0, "John");
    namesMap.put(1, "Mary");
    namesMap.put(2, "Peter");
    namesMap.put(3, "Paul");
    namesMap.put(4, "Mark");

    System.out.println(namesMap.subMap(0, 1));
    System.out.println(namesMap.tailMap(3));
    System.out.println(namesMap.tailMap(5));
    System.out.println(namesMap);
  }
}