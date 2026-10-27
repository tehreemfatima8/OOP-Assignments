
import java.util.Arrays;

public class Main {

    static void change(int[] x) {
        x[0] = 9;
    }

    public static void main(String[] args) {

        // 1. Default values of arrays
        int[] numbers = new int[3];
        String[] names = new String[2];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        // 2. Comparing strings
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // 3. Passing an array to a method
        int[] arr = {1, 2, 3};

        change(arr);

        System.out.println(Arrays.toString(arr));
    }
}
