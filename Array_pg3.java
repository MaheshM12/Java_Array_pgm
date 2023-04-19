import java.util.Scanner;

public class Array_pg3 {
    public static void main(String[] args) {
        // Taking size of array, elements and printing max and min value from array.
        
        System.out.println("Enter size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size];
       for(int i=0;i<size;i++){
        System.out.println("Enter values for array: ");
        ar[i]=sc.nextInt();
        }
        int max=0,min=ar[0];
        for(int i=0;i<size;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
            }
          System.out.println("the maximum value from array is :"+max);
          System.out.println("the minimum value from array is :"+min);
    
}}
