public class App {
    public static void main(String[] args) throws Exception {
        String grafic = "";

        for (int i = 0; i < args.length; i++) {
            int grade = Integer.parseInt(args[i]);
            for (int j = 0; j < grade; j++)
                grafic += "*";

            System.out.println("Aluno " + (i + 1) + " " + grafic);
            grafic = "";
        }
    }
}
