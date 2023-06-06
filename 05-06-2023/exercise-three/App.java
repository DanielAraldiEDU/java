import java.util.SortedSet;
import java.util.TreeSet;

public class App {
  public static void main(String[] args) throws Exception {
    SortedSet<String> names = new TreeSet<String>();

    // all names will be sorted
    names.add("John");
    names.add("Mary");
    names.add("Peter");
    names.add("Paul");
    names.add("Mark");

    System.out.println(names);
    System.out.println("First name: " + names.first());
    System.out.println("Last name: " + names.last());
    System.out.println("Names before Mary: " + names.headSet("Mary"));

    names.forEach(name -> System.out.println("Name: " + name));
    names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println("Name: " + name));
  }
}
