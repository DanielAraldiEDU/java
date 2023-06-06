import java.util.HashSet;
import java.util.Set;

public class App {
  public static void main(String[] args) throws Exception {
    Set<String> othersNames = new HashSet<String>();
    Set<String> names = new HashSet<String>();

    othersNames.add("Ana");
    othersNames.add("Maria");
    othersNames.add("Joana");
    othersNames.add("Marta");
    othersNames.add("Paula");

    names.add("John");
    names.add("Mary");
    names.add("Peter");
    names.add("Paul");
    names.add("Mark");

    System.out.println("Names amount: " + names.size());
    System.out.println("Contain John? " + names.contains("John"));

    names.remove("John");

    System.out.println("Is equal arrays: " + names.equals(othersNames));

    names.iterator().forEachRemaining(name -> System.out.println("Name: " + name));
  }
}
