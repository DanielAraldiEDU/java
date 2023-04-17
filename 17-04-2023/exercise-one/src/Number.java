public class Number {
    public static void main(String[] args) throws Exception {
        double sum = 0;
        int biggerNumber = 0, smallerNumber = 0;

        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);

            sum += number;

            if (i == 0) {
                biggerNumber = number;
                smallerNumber = number;
            } else {
                if (number < smallerNumber) smallerNumber = number;
                else if (number > biggerNumber) biggerNumber = number;
            }
        }

        double media = sum / args.length;

        System.out.println("Bigger number: " + biggerNumber);
        System.out.println("Smaller number: " + smallerNumber);
        System.out.println("Media of numbers: " + media);
    }
}
