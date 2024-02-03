public class Dog {
  private String name;
  private String race;
  private int age;

  Dog(String name, String race, int age) {
    this.name = name;
    this.race = race;
    this.age = age;
  }

  public void yap() {
    System.out.println(this.name + " Au! Au!");
  }
}
