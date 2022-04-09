
import java.io.IOException;

import java.util.Scanner;

public class PermutationandCombination {

    public static int factorial(int n) {

        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static int computePermutation(int a, int b) {
        int result = 0;

        int num = PermutationandCombination.factorial(a);
        int num_2 = PermutationandCombination.factorial(a - b);

        result = num / num_2;
        return result;

    }

    public static void main(String[] args) throws IOException {

        // BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number  :");
        int a = sc.nextInt();

        System.out.println("Enter Second Number :");

        int b = sc.nextInt();
        System.out.println("Permutation of two number is :" + PermutationandCombination.computePermutation(a, b));

        sc.close();
    }
}
