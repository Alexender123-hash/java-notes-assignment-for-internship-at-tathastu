import java.util.*;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n==1)
            return 0;
        else if(n==2 || n==3)
            return 1;
        else
            return (fibonacci(n-1)+fibonacci(n-2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number till now you want to calculate the fibonacci series");
        int n=sc.nextInt();
        int result=Fibonacci.fibonacci(n);
        System.out.println(n+"^th term of the fibonacci series is :"+result);
        sc.close();


    }
}
