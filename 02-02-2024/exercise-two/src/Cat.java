public class Cat {
  private String name;
  private String race;
  private int age;

  Cat(String name, String race, int age) {
    this.name = name;
    this.race = race;
    this.age = age;
  }

  void meow() {
    System.out.println(this.name + " Meow Meow");
  }
}
