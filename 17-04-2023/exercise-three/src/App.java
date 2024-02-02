public class App {
    public static void main(String[] args) throws Exception {
        String name = "Daniel Sansão Araldi";
        String[] names = name.split(" ");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(4));
        System.out.println(name.concat(" is a programmer"));
        System.out.println(name.contains("Daniel"));

        for (String username : names)
            System.out.println(username);
    }
}
