import java.util.Scanner;

public class Mirror {

    public static boolean isMirror(int arr[]){
    
        for (int i = 0; i < arr.length; i++) {
 
        // If condition fails for any element
        if (arr[arr[i]] != i)
            return false;
            // Given array is mirror-inverse
        }
        return true;
}

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int n=sc.nextInt();

    int a[]=new int[n];

    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    if(isMirror(a))
    System.out.println("yes it is mirror of the original one");
    else
    System.out.println("no its not the mirror of the original one");
    sc.close();
    }

}