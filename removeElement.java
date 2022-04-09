import java.util.ArrayList;
import java.util.Scanner;

public class removeElement {
    public static void remove(ArrayList <Integer> arr){

        System.out.println("enter how many elements you want to remove");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>arr.size())
        System.out.println("Please enter less value");

        for(int i=0;i<n;i++){
            arr.remove(i);
        }
        sc.close();


    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println("Before removed operation");
        System.out.println(arr);


        System.out.println("Before removed operation");

        removeElement.remove(arr);

        
        System.out.println("After removed operation");
        System.out.println(arr);
        

    }
}
