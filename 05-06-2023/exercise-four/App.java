import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) throws Exception {
    Map<Integer, String> namesMap = new HashMap<Integer, String>();

    namesMap.put(0, "John");
    namesMap.put(1, "Mary");
    namesMap.put(2, "Peter");
    namesMap.put(3, "Paul");
    namesMap.put(4, "Mark");

    namesMap.replace(0, "Jack");

    System.out.println(namesMap);
    System.out.println("Is exists key? " + namesMap.containsKey(5));
    System.out.println("Is exists name? " + namesMap.containsValue("Jack"));
    System.out.println("First name map: " + namesMap.get(0));
  }
}
