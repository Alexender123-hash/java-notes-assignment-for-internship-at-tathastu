import java.util.*;

public class Palindrom {
    protected static boolean checkPalindrom(String str,int i,int j){


        if(i>=j)
        return true;
        
        if(str.charAt(i)==str.charAt(j))
        return  checkPalindrom(str,++i,--j);
        else
          return false;

    }
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String :");
    String  str=sc.next();
    
    int i=0,j=str.length()-1;

    boolean result=Palindrom.checkPalindrom(str,i,j);
    if(result)
    System.out.println("STRING IS PALINDROM");
    else
    System.out.println("STRING IS NOT PALINDROM");
    sc.close();
}
}