import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        int number = scanner.nextInt();

        // Check if the number falls within the specified intervals
        boolean isInInterval = (number > -15 && number <= 12) || (number > 14 && number < 17) || (number >= 19);

        // Print True if the number is in the interval, otherwise print False
        System.out.println(isInInterval ? "True" : "False");
    }
}
