import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    List<String> names = new ArrayList<String>();

    names.add("John");
    names.add("Mary");
    names.add("Peter");
    names.add("Paul");
    names.add("Mark");

    names.remove(0);

    System.out.println("First name: " + names.get(0));

    names.set(0, "Doe");

    names.add(0, "Ana");

    System.out.println("All names: " + names);
    System.out.println("Names amount: " + names.size());
  }
}
