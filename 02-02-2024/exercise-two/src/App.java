public class App {
    public static void main(String[] args) throws Exception {
        Dog firstDog = new Dog("Fido", "Pincher", 2);
        Dog secondDog = new Dog("Rex", "Poodle", 5);
        firstDog.yap();
        secondDog.yap();

        Cat firstCat = new Cat("Mimi", "Himalaia", 3);
        Cat secondCat = new Cat("Tata", "Sphynx", 7);
        firstCat.meow();
        secondCat.meow();
    }
}
