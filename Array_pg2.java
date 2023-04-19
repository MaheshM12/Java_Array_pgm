import java.util.Scanner;

public class Array_pg2 {
    public static void main(String[] args) {
       // Taking size of array, elements and printing in reverse order.
       
       System.out.println("Enter size of the array:");
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int ar[]=new int[size];
      for(int i=0;i<size;i++){
       System.out.println("Enter values for array: ");
       ar[i]=sc.nextInt();
       }
       System.out.println("Printing array in reverse order :");
       for(int i=size-1;i>=0;i--){

        System.out.print(ar[i]+" ");
     
        }
        
       

    }
    
}
