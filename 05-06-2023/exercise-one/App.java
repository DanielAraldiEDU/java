import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    List<String> othersNames = new ArrayList<String>();
    List<String> names = new ArrayList<String>();

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

    names.remove(0);

    System.out.println("First name: " + names.get(0));

    names.set(0, "Doe");

    names.add(0, "Jack");

    names.addAll(0, othersNames);

    System.out.println("All names: " + names);
    System.out.println("Names amount: " + names.size());

    names.clear();

    System.out.println("Is empty array: " + names.isEmpty());
  }
}
