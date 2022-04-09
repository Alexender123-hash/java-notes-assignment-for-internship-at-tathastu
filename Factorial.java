import java.util.*;
/**
 * Factorial
 */
public class Factorial {

    public static int factorial(int n){

        if(n==0)
        return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number you want to calculate the factorial:");
    int n=sc.nextInt();

    System.out.println("factorial of the "+n+" ^ th number is :"+Factorial.factorial(n) );
    sc.close();
}
}