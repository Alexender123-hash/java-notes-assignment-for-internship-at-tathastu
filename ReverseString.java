import java.util.Scanner;

public class ReverseString {

    public static void reverse(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        System.out.println("reversed String is :"+str);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();

        ReverseString.reverse(str);
        sc.close();
    }
}
