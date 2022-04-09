import java.util.Scanner;

public class Cal {
   public int add(int x,int y){
        return x+y;
    }
    int sub(int x,int y){
        return x-y;
    }
    
    int multiply(int x,int y){
    return x*y;
    }
     
    
    float division(int x,int y){
        return x/y;
    }
    
    int factorial(int num){
        
        int fact=1;
        
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    int calculateRemainder(int a,int b){
        return a%b;
    }

    
    public static void main(String[] args) {
        
        Cal c=new Cal();//this is for creating the object
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the first number :");
        int a=sc.nextInt();
        
        System.out.println();//this is for line changing
        
        System.out.print("Enter the Second number :");
        int b=sc.nextInt();
    
        sc.close();
        System.out.println("summation values is :"+c.add(a,b));
        System.out.println("substraction values is :"+c.sub(a,b));
        System.out.println("multiply  values is :"+c.multiply(a,b));
        System.out.println("division values is :"+c.division(a,b));
        System.out.println("remainder value is :"+c.calculateRemainder(a,b));
        
        
    }
}
