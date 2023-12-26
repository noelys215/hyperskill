import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int[] years = new int[size];
        int[] numbers = {1, 2, 3, 5, 4, 6, 4};

        Arrays.fill(years, 1, 10, 5);
        Arrays.fill(years, 1, 10 / 2, 15);

        System.out.println(Arrays.toString(years));
        System.out.println(years.length + "\n");
        for (int year : years) System.out.println(year += 1);

        System.out.println("\n" + numbers.length);

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 6;
        n = arr[arr[n]];

        System.out.println(n);
    }
}