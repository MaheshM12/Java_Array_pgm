import java.util.Scanner;

class main{
    public static void main(String[] args) {
        
        //the is for taking size of array and elements and display.

        System.out.println("Enter size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size];
       for(int i=0;i<size;i++){
        System.out.println("Enter values for array: ");
        ar[i]=sc.nextInt();
        }

        System.out.println("The array element is given by :");
        for(int i=0;i<size;i++){
            System.out.print(ar[i]+" ");
           
            }
    }
}