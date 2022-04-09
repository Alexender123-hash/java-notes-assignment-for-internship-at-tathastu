import java.util.Scanner;

public class Diamond {
    public static void printDiamond(int n){

        int  i, j, space = 1;
        System.out.println("Enter the number of rows: ");
        space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();

        System.out.println("Diamond :");
        Diamond.printDiamond(n);

        sc.close();
    }
}
